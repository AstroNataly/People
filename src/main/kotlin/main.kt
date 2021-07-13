package ru.netology

fun main() {
    val likes = 351

    if ((likes % 10) == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}