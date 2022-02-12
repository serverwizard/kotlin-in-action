package chapter2

import chapter2temp.Color
import chapter2temp.Color.BLUE
import chapter2temp.Color.GREEN
import chapter2temp.Color.INDIGO
import chapter2temp.Color.ORANGE
import chapter2temp.Color.RED
import chapter2temp.Color.VIOLET
import chapter2temp.Color.YELLOW

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
}
