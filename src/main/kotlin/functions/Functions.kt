package functions



fun main(args: Array<String>) {
    fun roundFourDigit(num: Int): String {
        return if (num < 1000) {
            num.toString()
        } else {
            num.toString().substring(0, 1) + "K"
        }
    }
//    println(roundFourDigit(9999))



    fun Int.getCorrectEndingForYears(): String {
        val endings = listOf("год", "года", "лет")
        val remainder = this % 100

        return when {
            remainder in 11..19 -> endings[2]
            remainder % 10 == 1 -> endings[0]
            remainder % 10 in 2..4 -> endings[1]
            else -> endings[2]
        }
    }


//    println("1 " + 1.getCorrectEndingForYears())
//    println("2 " + 2.getCorrectEndingForYears())
//    println("5 " + 5.getCorrectEndingForYears())



    fun Double.calculateDiscount(discountPercent: Double): Double {
        return  "%.2f".format(this-(this * discountPercent / 100)).replace(",",".").toDouble()
    }

//    println((100.00).calculateDiscount(10.0))


    fun String.countWords(): Int {
        return this.split(" ", ",", ";", ".").filter { it.isNotEmpty() }.size
    }

    val wordCount1 = "Привет, мир! Как дела?".countWords()
    println("Количество слов: $wordCount1")


    val wordCount2 = "Это   пример   с   лишними   пробелами.".countWords()
    println("Количество слов: $wordCount2")


    val wordCount3 = "Это;пример;с;точками;с;запятой.".countWords()
    println("Количество слов: $wordCount3")



}