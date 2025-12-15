package lessons.lessons26.homework

import java.io.File

fun main() {
   // 1
    File("workspace/task1/example.txt").apply {
        parentFile.mkdirs()
        writeText("Hello, Kotlin!")
    }.also {
        println("Файл существует: ${it.exists()}")
    }

// 2
    File("workspace/task2/testDir").apply {
        mkdirs()
    }.also {
        println("Это директория: ${it.isDirectory}")
        println("Абсолютный путь: ${it.absolutePath}")
    }

// 3
    File("workspace/task3/structure").apply {
        mkdirs()
        resolve("myDir").apply {
            mkdirs()
            resolve("subDir1").mkdirs()
            resolve("subDir2").mkdirs()
        }.also { myDir ->
            val contents = myDir.listFiles()?.map { it.name }?.sorted() ?: emptyList()
            println("Содержимое myDir: $contents")
            println("subDir1 существует: ${myDir.resolve("subDir1").exists()}")
            println("subDir2 существует: ${myDir.resolve("subDir2").exists()}")
        }
    }

 // 4
    File("workspace/task4/temp").apply {
        mkdirs()
        resolve("file1.txt").writeText("text1")
        resolve("file2.txt").writeText("text2")
        resolve("subdir").apply {
            mkdirs()
            resolve("nested.txt").writeText("nested content")
        }
    }
    // Удаляем всю директорию задания 4 рекурсивно
    val task4Dir = File("workspace/task4")
    println("Удаление ${task4Dir.absolutePath}...")
    println("Успешно удалено: ${task4Dir.deleteRecursively()}")

 // 5
    File("workspace/task5/config/config.txt").apply {
        parentFile.mkdirs()
        writeText("""
            name=Kotlin
            version=2.0.0
            author=JetBrains
            enabled=true
        """.trimIndent())
    }.also { file ->
        val values = file.readLines()
            .asSequence()
            .map { it.trim() }
            .filter { it.isNotEmpty() && !it.startsWith("#") }
            .mapNotNull { line -> line.split("=", limit = 2).getOrNull(1)?.trim() }
            .toList()
        println("Значения: $values")
    }

    // 6
    File("workspace").also { root ->
        val dirs = mutableListOf<File>()
        val files = mutableListOf<File>()

        fun walk(file: File) {
            if (file.isDirectory) {
                dirs += file
                file.listFiles()?.forEach { walk(it) }
            } else {
                files += file
            }
        }

        if (root.exists()) {
            walk(root)
            println("Директории:")
            dirs.sortedBy { it.path }.forEach { println("  📁 ${it.path}") }

            println("\nФайлы:")
            files.sortedBy { it.path }.forEach { println("  📄 ${it.path}") }
        } else {
            println("Директория 'workspace' не найдена (возможно, удалена в задаче 4). Пропускаем.")
        }
    }

// 7
    File("workspace/task7/docs").apply {
        mkdirs()
        resolve("readme.md").also { readme ->
            if (!readme.exists()) {
                readme.writeText("This is a README file.")
            }
            println("readme.md существует: ${readme.exists()}")
            println("Содержимое: \"${readme.readText()}\"")
        }
    }
}

