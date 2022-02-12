package chapter2

import chapter2temp.Color
import chapter2temp.Color.BLUE
import chapter2temp.Color.GREEN
import chapter2temp.Color.INDIGO
import chapter2temp.Color.ORANGE
import chapter2temp.Color.RED
import chapter2temp.Color.VIOLET
import chapter2temp.Color.YELLOW

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}
