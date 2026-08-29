class Calculator(val name: String) {
    init {
        println("${name}'s calculator.")
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            println("You cannot divide by 0!")
        } else {
            return num1 / num2
        }
    }

    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for (i in 1..num2) {
            result *= num1
        }
        return result
    }


}

fun main() {
    var calcName = Calculator("Codey")
    println(calcName.add(1, 1))
    println(calcName.subtract(1, 1))
    println(calcName.divide(1, 1))
    println(calcName.power(1, 1))
}
