package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val amount = 10000
    val tax = 0.0075
    val min_tax = 35

    val result = if ((amount * tax) < 35) min_tax else amount * tax

    println("Размер комиссии составляет $result рублей.")
}