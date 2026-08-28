// Write your code below
fun getListOfNumbers(): Int {
    var myList = mutableListOf<>()
        for (i in 1..7) {
            println("Please enter a number: ")
            val answer = Integer.valueOf(readLine())
            myList.add()

        }
    return myList
}

fun findMax(): Int {
    var largestNumber = myList[0]

    for (largestElement in myList) {
        if (largestElement > largestNumber) {
            largestNumber = largestElement
        }
    }
    return largestNumber
}

fun findmin(): Int {
    var smallestNumber = myList[0]

    for (smallestElement in myList) {
        if (smallestElement < smallestNumber) {
            smallestNumber = smallestElement

        }
    }
    return smallestNumber
}

fun findAverage(): Int {
    var sum = 0

    for (averageElement in myList) {
        averageElement + sum
    }
    return sum / averageElement
}

fun checkIfListContains(): Int {
    for (listCheck in myList) {
        if (listCheck == myList) {
            return true
        }
    }
    return false
}

fun main() {
    // Write more code below
    var values = getListOfNumbers()
    var largestValue = findmax(values)
    var smallestValue = findmin(values)
    var average = findAverage(values)
    var containsValue = charArrayOf(values, numToFind)

    if (containsValue ) {
        println("The values exist within the list.")
    } else {
        println("The value doesn't exist in the list.")
    }

    println(values)
    println("The largest number is $largestValue")
    println("The smallest number is $smallestValue")
    println("The average is $average")

    println("Please input a number here: ")
    val numTofind = Integer.valueOf(readLine())
}

