package lessons.lessons13.homework

fun main1() {
//    Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val timeTest = mapOf("firstTest" to 60, "secondTest" to 234, "thirdTest" to 25)
    val a1 = timeTest.values.average()

//    Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testMetaData = mapOf("test1" to "metadata1", "test2" to "metadata2", "test3" to "metadata3")
    val a2 = testMetaData.keys.toList()

//    В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testRun = timeTest.toMutableMap()
    testRun["fourTest"] = 342

//    Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val resultTest = mapOf("loginTest" to "passed", "registrationTest" to "passed", "logoutTest" to "Failed", "getInfoUser" to "skipped")
    resultTest.count() { it.value == "passed" }

//    Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val bugTracking = mutableMapOf("bug1" to "fixed", "bug2" to "inProgress", "bug3" to "InTest")
    bugTracking.remove("bug1")

//    Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val resultTestWebPage = mapOf("https://stimmax.ru/lesson/rabota-so-slovaryami" to 200, "https://www.youtube.com" to 500)
    resultTestWebPage.forEach { (url, status) -> println("Page: $url, Status: $status") }

//    Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val timeResponse = 100
    val serviceTimeResponse = mapOf("verificationService" to 32, "healthCheck" to 443)
    val failedCheckService = serviceTimeResponse.filterValues { it > timeResponse }

//    В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
//    Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val resultTestApi = mapOf("/login" to 200, "/infoUser" to 400, "/goodsList" to 500)
    val getResultTestEndpoint = resultTestApi.getOrDefault("/login", "not tested")

//    Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация),
//    получите значение для "browserType". Ответ не может быть null.
    val configEnvironment = mapOf("responseTime" to "300s", "browserType" to "Chrome")
    val getConfigInfo = configEnvironment.getValue("browserType")

//    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val versions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val newVersions = versions + ("v1.2" to "alpha")

//    Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val deviceConfigs = mapOf("Pixel6" to "Android 13", "iPhone13" to "iOS 16")
    val model = "GalaxyS22"
    val config = deviceConfigs.getOrDefault(model, "default settings")
//    Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errors = mapOf("500" to "Timeout", "400" to "Auth failed")
    val hasError1 = errors.containsKey("500")
//    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val testScenarios = mapOf("TC001_v2.1" to "Passed", "TC002_v1.9" to "Failed", "TC003_v2.1" to "Skipped")
    val targetVersion = "v2.1"
    val filtered = testScenarios.filterKeys { it.contains(targetVersion) }
//    У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val moduleResults = mapOf("Auth" to "OK", "Payment" to "FAIL", "UI" to "OK")
    val hasFailures = moduleResults.any { it.value == "FAIL" }
//    Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val envSettings = mutableMapOf("url" to "prod")
    val newSettings = mapOf("token" to "abc123", "timeout" to "60s")
    envSettings.putAll(newSettings)
//    Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("B1" to "critical")
    val bugs2 = mapOf("B2" to "minor")
    val allBugs = bugs1 + bugs2
//    Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempTestRun = mutableMapOf("lastRun" to "2025-10-20", "status" to "complete")
    tempTestRun.clear()
//    Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val testReport = mapOf("t1" to "passed", "t2" to "skipped", "t3" to "failed")
    val filteredReport = testReport.filterNot { it.value == "skipped" }
//    Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val configs = mapOf("db" to "mysql", "cache" to "redis", "log" to "debug")
    val toRemove = setOf("cache", "log")
    val cleanConfigs = configs - toRemove
//    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResults = mapOf("ID001" to "Passed", "ID002" to "Failed")
    val reportLines = testResults.map { (id, result) -> "Test ID: $id Result: $result" }
//    Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val mutableResults = mutableMapOf("t1" to "ok", "t2" to "fail")
    val archivedResults: Map<String, String> = mutableResults.toMap()
//    Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val numericTests = mapOf(101 to 12.5, 102 to 8.3)
    val stringTests = numericTests.mapKeys { it.key.toString() }
//    Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val perfScores = mapOf("v1.0" to 200.0, "v1.1" to 180.0)
    val adjustedScores = perfScores.mapValues { it.value * 1.1 }
//    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors = mapOf<String, String>()
    val isEmpty = compileErrors.isEmpty()
//    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults = mapOf("scenario1" to "success")
    val isNotEmpty = loadTestResults.isNotEmpty()
//    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val autoTests = mapOf("t1" to "passed", "t2" to "passed")
    val allPassed = autoTests.all { it.value == "passed" }
//    Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val testOutcomes = mapOf("t1" to "passed", "t2" to "error", "t3" to "passed")
    val hasError = testOutcomes.any { it.value == "error" }
//    Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val serviceTests = mapOf(
        "optional_login" to "failed",
        "mandatory_checkout" to "passed",
        "optional_cache" to "error"
    )
    val failedOptionals = serviceTests.filter { (name, status) ->
        !status.equals("passed", ignoreCase = true) && name.contains("optional")
    }
}


fun main2(a1: Map<String, String>): Int {
    val resultTest = mapOf("loginTest" to "passed", "registrationTest" to "passed", "logoutTest" to "Failed", "getInfoUser" to "skipped")
    val a2 = resultTest.count() { it.value == "passed" }
    return a2

}

fun main() {
    println(main2(mapOf("loginTest" to "passed", "registrationTest" to "passed", "logoutTest" to "Failed", "getInfoUser" to "skipped")))
}