package chapter2

class Person(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
//    person.name = "Sam" // 컴파일 오류
    println(person.name)

    person.isMarried = false
    print(person.isMarried)
}
