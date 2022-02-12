package chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number) // kotlin.Unit
}

fun main(args: Array<String>) {
    var reader = BufferedReader(StringReader("not a number"))
    println(readNumber(reader))
}
