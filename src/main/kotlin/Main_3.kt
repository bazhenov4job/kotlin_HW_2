package ru.netology

fun main() {
    val amount = 12000
    val regularCustomer = false

    var result = amount
    if (1000 < amount && amount <= 10000) {
        result = result - 100
    }
    else if (amount > 10000) {
        result = (result * (1 - 0.05)).toInt()
    }
    // из условия неясно, применять ли скидку постоянного пользователя
    // при покупке до 1к, поэтому я решил оставить
    // в условии в вычислении, кстати допущена ошибка - правильно не 100 - 0.01, а 1 - 0.01
    if (regularCustomer) {
        result = (result * 0.99).toInt()
    }

    println("Итоговая стоимость покупки составила $result рублей.")
}