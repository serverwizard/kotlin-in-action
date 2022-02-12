package chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean // 커스텀 접근자
        get() = height == width
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(1, 3)
    val square = Rectangle(2, 2)

    println(rectangle.isSquare)
    println(square.isSquare)
}
