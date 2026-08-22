fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    println("What is 75 / 5?")
    var studentAnswer1 = Integer.valueOf(readlnOrNull())

    println("What does y equal in 6 * 2y = 36?")
    var studentAnswer2 = Integer.valueOf(readlnOrNull())

    println("Name the type of triangle that has two equal sides.")
    var studentAnswer3 = readlnOrNull()

    println("what is the value of 8 * 6 - (3 - 2)?")
    var studentAnswer4 = Integer.valueOf(readlnOrNull())

    var points = 0

    if (studentAnswer1 == quizAnswer1) {
        points += 25
    } else {
        points++
    }
    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
        points += 20
    } else {
        points++
    }
    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points++
    }
    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points++
    }

    when (points) {
        in 0..59 -> println("Grade: F")
        in 60..69 -> println("Grade: D")
        in 70..79 -> println("Grade: C")
        in 80..89 -> println("Grade: B")
        in 90..100 -> println("Grade: A")
        in 101..110 -> println("Grade A+")
    }
}