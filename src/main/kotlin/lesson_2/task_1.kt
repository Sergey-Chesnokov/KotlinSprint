package org.example.lesson_2
fun main() {
    val numberOfStudents = 4

    val student1EnglishAssessment = 3
    val student2EnglishAssessment = 4
    val student3EnglishAssessment = 3
    val student4EnglishAssessment = 5

    val averageStudentScore = ((student1EnglishAssessment + student2EnglishAssessment + student3EnglishAssessment + student4EnglishAssessment) / numberOfStudents).toDouble()
    val formatted = String.format("%.2f", averageStudentScore)
    println("Средний бал по английскому языку: $formatted")
}
