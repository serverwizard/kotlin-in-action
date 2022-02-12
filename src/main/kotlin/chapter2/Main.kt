package chapter2

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean // 커스텀 접근자
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
