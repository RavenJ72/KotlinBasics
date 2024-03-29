package cycles

import kotlin.math.sqrt
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


    fun findDivisors(number: Int) {
        val divisors = mutableListOf(1)
        var i = 2
        while (i * i <= number) {
            if (number % i == 0) {
                divisors.add(i)
                divisors.add(number / i)
            }
            i++
        }
        if (i * i > number && number > 1) {
            divisors.add(number)
        }
        println(divisors.sorted().toString().drop(1).dropLast(1))
    }
//    findDivisors(45)



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
    printNumbersSum()


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

//    findingSum()




}


