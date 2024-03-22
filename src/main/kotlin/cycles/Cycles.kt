package cycles

import kotlin.random.Random


fun main() {

    fun drawingByNumbers() {
        for (i in 1..5) {
            repeat(i) { print(i) }
            println()
        }
    }

    //drawingByNumbers()

    fun simpleNumberGuessingGame() {
        val secretNumber: Int = Random.nextInt(1, 10)
        var number: Int
        println("Ваша задача угадать загаданное рандомное число от (1 до 9).")
        do {
            println("Введите ваше число в консоль.")
            number = readLine()?.toInt() ?: 0
        } while (number != secretNumber)

        println("Победа")
    }

    //simpleNumberGuessingGame()


    fun printNumberDividers() {
        println("Введите число, делители, которого нужно получить.")

        var dividers = ""
        val number: Int = readLine()?.toInt() ?: 0

        for (i in 1..number) {

            if (number % i == 0) dividers += "$i,"

        }
        println(dividers.dropLast(1))
    }

    //printNumberDividers()


    fun splitEvenOddDigits() {
        println("Введите число")

        var evenDigitsCounters: Int = 0
        val number = readLine()?.toCharArray()


        if (number != null) {
            for (i in number) if (i.code % 2 == 0) evenDigitsCounters++
        }
        if (number != null) {
            println("Even digits: $evenDigitsCounters\nOdd digits ${number.size - evenDigitsCounters}")
        }
    }

    //splitEvenOddDigits()

    fun printNumbersSum() {
        var sum: Int = 0
        for (i in 4..100 step 4) sum += i
        println(sum)
    }
    //printNumbersSum()


    fun findingSum() {
        var startNumber = 5
        var sum = 0

        while (startNumber < 57) {
            if (startNumber != 34 && startNumber != 46 && startNumber != 52) {
                sum += startNumber
            }
            startNumber++
        }

        println(sum)
    }

    findingSum()




}


