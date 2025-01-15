package ru.netology

fun main() {
    val likes = 41
    val verbose = "людям"
    val uni = "человеку"

    val result = if (likes % 10 == 1) uni else verbose

    println("Понравилось $likes $result")
}