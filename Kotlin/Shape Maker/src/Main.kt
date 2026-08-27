fun main() {
    // Square Variables
    val sqSide = 7
    val sqChar1 = "X  "
    val sqChar2 = "O  "
    // Write your code below
    for (row in 1..sqSide) {
        for (col in 1..sqSide) {
            if (row % 2 == 0 && col % 2 == 0) || (row % 2 == 1 && col % 2 == 1) {
                println(sqChar1)
            } else {
                print(sqChar2)
            }
        }
        println()
    }

    // Triangle Variables
    val triRows = 10
    var triCount = 0
    var triRowLen = triRows
    val triChar1 = "/  "
    val triChar2 = "   "
    // Write your code below
    for (triRow in triRows downTo 1) {
        while (triCount < triRowLen) {
            triCount++
            print(triChar1)
        }
        println()
    }
}