package org.example.lesson_1

fun main() {
    var seconds: Short = 6480
    var HOURS = 3600 // 3600 секунд в часе
    var flightTimeOfTheHours = seconds / HOURS
    var MINUTE = 60 // секунд в минуте
    var flightTimeOfTheMinutes = (seconds % HOURS) / MINUTE // (остаток от деления общего количсетва секунд на количество секунд в часе) разделить на количество сикунд в минту
    var flightTimeOfTheSeconds = seconds % 60 // остаток в секундах который не поместился в минутах

    var flightTime = String.format("%02d:%02d:%02d", flightTimeOfTheHours, flightTimeOfTheMinutes, flightTimeOfTheSeconds)

    println(flightTime)



}