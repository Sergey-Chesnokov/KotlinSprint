package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val flightTimeOfTheHours = seconds / HOURS
    val flightTimeOfTheMinutes = (seconds % HOURS) / MINUTE // (остаток от деления общего количсетва секунд на количество секунд в часе) разделить на количество сикунд в минту
    val flightTimeOfTheSeconds = seconds % MINUTE // остаток в секундах который не поместился в минутах

    val flightTime = String.format("%02d:%02d:%02d", flightTimeOfTheHours, flightTimeOfTheMinutes, flightTimeOfTheSeconds)

    println(flightTime)
}

const val  HOURS = 3600 // 3600 секунд в часе
const val MINUTE = 60 // секунд в минуте