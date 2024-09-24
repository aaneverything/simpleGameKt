package com.example.rockpaper

import kotlin.random.Random

object game {

    private val rules = mapOf(
        "rock - scissors" to true,
        "scissors - paper" to true,
        "paper - rock" to true,
        "rock - paper" to false,
        "scissors - rock" to false,
        "paper - scissors" to false
    )

    private val options = listOf("rock", "paper", "scissors")

    fun randd(): String = options[Random.nextInt(0, 3)]

    private val optionDrawble = mapOf(
        "rock" to R.drawable.batu,
        "paper" to R.drawable.kertas,
        "scissors" to R.drawable.gunting
    )

    fun pickdrwa(option: String): Int = optionDrawble[option]!!

    fun isDraw(from: String, to:String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from - $to"]!!

}