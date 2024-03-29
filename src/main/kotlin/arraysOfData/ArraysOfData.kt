package arraysOfData

import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

fun main(args: Array<String>) {

    fun printArrayOfRange(a:Int,b:Int){
        println(IntArray(max(a, b) - min(a, b) + 1) { i -> i + a }.contentToString())
    }
    //printArrayOfRange(5,8)
//    val fn = Random.nextInt(1,20)
//    val sn = Random.nextInt(1,20)
//    printArrayOfRange(fn,sn)




    fun printMutableListAfterSomeOperations(){
        val mutableList: MutableList<Int> = mutableListOf(1,2,3,4,5)
        mutableList.addAll(listOf(8,21,5,90,11,0))
        mutableList.add(0,90);
        mutableList.removeAt(4)
        mutableList.add(mutableList.size,-35)
        println(mutableList)

    }
   // printMutableListAfterSomeOperations()

    fun printMaxAndMinValuesInRandomArray(array: IntArray){
        val mutableList = array.toMutableList()

        var maxElement = Int.MIN_VALUE;
        var minElement = Int.MAX_VALUE;
        mutableList.forEach { e ->
            run {
                if (e > maxElement) maxElement = e
                if (e < minElement) minElement = e
            }
        }
        println("Max value: $maxElement")
        println("Min value: $minElement")

        println("Max value: ${mutableList.maxOrNull()}")
        println("Min value: ${mutableList.minOrNull()}")
    }

//    printMaxAndMinValuesInRandomArray(listOf(24,-63,67,-12,88,94,-28,82,0,53).toIntArray())



    fun printSecondMinElementInArray(){
        val array = readLine().toString().split(",").map { it.toInt() }.toMutableList()
        array.remove(array.minOrNull())
        println(array.minOrNull())
    }
//    printSecondMinElementInArray()



    fun selectionSort(array:Collection<Int>) : Collection<Int>?{

        val mutableList = array.toMutableList()
        for (i in mutableList.indices){
            var minValue = Int.MAX_VALUE;
            var minIndex = 0;
            for (j in i until mutableList.size){
                if(mutableList[j] < minValue) {
                    minValue=mutableList[j]
                    minIndex = j
                }
            }
            mutableList[minIndex] = mutableList[i]
            mutableList[i] = minValue
        }

        return mutableList.toList()
    }

//    println(readLine()?.split(",")?.map{it.toInt()}?.let { selectionSort(it.toMutableList()) })


    fun getAllNumberOverTheAverageInArray(){
        val array = readLine()?.split(",")?.map{it.toInt()}?.let {selectionSort(it.toMutableList())}
        println(array?.filter { it > array.average() }?.toList())
    }
    getAllNumberOverTheAverageInArray()







}