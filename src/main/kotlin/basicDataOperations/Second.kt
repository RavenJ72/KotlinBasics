package basicDataOperations

import javax.management.InvalidAttributeValueException
import kotlin.math.abs
import kotlin.text.toInt as toInt

fun main(args: Array<String>) {

    fun divisionReminder(){
        if(20%17 > 0) println("Получилось значение большее чем ноль!")
    }


    fun ageChecker(){
        val age:Int = readLine()?.toInt() ?: 0;
        if(age>18) println("Вам уже все можно")
        if(age==18) println("Ура, Вам 18 лет!")
        if(age<18) println("Вы еще слишком молоды")
    }


    fun simpleCalculator(){
        val x = 2
        val y = 6
        println("Выберете действие, введите число, которое соответсвует дейсвию:\n1.Добавить\n2.Отнять\n0.Ничего")
        val actionNumber = readLine()!!.toInt()
        when(actionNumber){
            1 -> println(x+y)
            2 -> println(x-y)
        }
    }

    fun intToWeekDayConverter(day:String){
        when(day.toInt()){
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
        }
    }


    fun findingTheAverageNumber(x:Int,y:Int,z:Int): Int{
        if(x==y || x==z || y==z){
            throw InvalidAttributeValueException("Ошибка")
        }else{
            return when{
                (x in z until y) || (x in y  until z) -> x
                (y in z until x) || (y in x  until z) -> y
                else -> z
            }
        }
    }


//    println(findingTheAverageNumber(1, 2, 3))



    fun calculatingProfits(expenses:Int,income:Int){
        val result = (income-expenses);
         when{
            (result >= 0) -> println("Ваша прибыль составила $result")
             else -> println("Ваши убытки составили ${abs(result)}")
        }
    }

//    calculatingProfits(750,345)


    fun variableChecking(x:Int,y:Int): Boolean{
        return when{
            x%2==0 && y%2==0 -> true
            else -> false
        }
    }

    println(variableChecking(2, 0))


}




