package ru.netology

fun main() {
    val likes = 111
    val verbose = "людям"
    val uni = "человеку"

    val result = if ((likes % 10 == 1) && !(likes.toString().endsWith("11"))) uni else verbose

    println("Понравилось $likes $result")
}