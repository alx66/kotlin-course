package lessons.lessons16.homework.logger

class Logger {
    fun log(message: String) {
        println("[INFO] $message")
    }

    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33m[$level] $message\u001B[0m")
            "ERROR" -> println("\u001B[41m\u001B[97m[$level] $message\u001B[0m")
            else -> println("[$level] $message")
        }
    }

    fun log(messages: List<String>) {
        messages.forEach { log(it) }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "An error occurred")
    }
}