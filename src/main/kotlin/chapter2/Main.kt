package chapter2

import chapter2temp.Color
import chapter2temp.Color.BLUE
import chapter2temp.Color.GREEN
import chapter2temp.Color.INDIGO
import chapter2temp.Color.ORANGE
import chapter2temp.Color.RED
import chapter2temp.Color.VIOLET
import chapter2temp.Color.YELLOW

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
            (c2 == YELLOW && c2 == RED) -> ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
            (c1 == BLUE && c2 == YELLOW) -> GREEN

        (c1 == BLUE && c2 == VIOLET) ||
            (c1 == VIOLET && c2 == BLUE) -> INDIGO

        else -> throw Exception("Dirty Color")
    }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}
