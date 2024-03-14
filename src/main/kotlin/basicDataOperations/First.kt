package basicDataOperations

fun main(args: Array<String>) {

    // Практическая №1
    fun printDifferentValues() {
        println("Иван")
        println(35)
        println(true)
    }

    fun variableSetting() {
        var intValue: Int = 5
        var charValue: Char = 'F'
        var stringValue: String = "Привет"
        var doubleValue: Double = 90.2
        val immutableValue: Int = 67
        println(stringValue)
    }

    fun numberDivider(fullNumber: Int): List<String> {
        return fullNumber.toString().trim().split("").toList()
    }
    //println(numberDivider(123).forEach { e-> println(e) })

    fun daysToFullDataConverter(weeksCounter: Int): String {
        println(weeksCounter / 365)
        println(weeksCounter % 365 / 7)
        println(weeksCounter % 365 % 7)
        return "Лет: " + weeksCounter / 365 + ",недель: " + weeksCounter % 365 / 7 + ",дней: 3"
    }
    //println(daysToFullDataConverter(2642))


    fun numberManipulations(number: Int): Int {
        return (number.toString() + (number * 2).toString()).toInt()
    }
    //println(numberManipulations(23))


    fun helloConsoleInterfaceApp() {
        println("Здравствуйте, введите ваше имя.")
        val name = readLine()
        println("Теперь введите ваш возраст.")
        val age = readLine()
        println("Привет, $name! Тебе уже $age лет!")
    }

    //helloConsoleInterfaceApp()
}