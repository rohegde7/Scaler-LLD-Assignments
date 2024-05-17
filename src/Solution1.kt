class PassByValueTest1 {
    var age = 0
    var name: String? = null
    fun display() {
        println("KOTLIN My name is $name. I am $age years old")
    }

    fun sayHello(name: String) {
        println(this.name + " says hello to " + name)
    }
}

class Client1 {
    fun swap(s1: PassByValueTest1, s2: PassByValueTest1) {
        var s1 = s1
        var s2 = s2
        val temp = s1
        s1 = s2
        s2 = temp
    }
}

fun main() {
//    val client = Client1()
//    val s1 = PassByValueTest1()
//    s1.age = 10
//    s1.name = "A"
//    val s2 = PassByValueTest1()
//    s2.age = 20
//    s2.name = "B"
//    client.swap(s1, s2)
//    s1.display()


    val n = listOf<Int>(1, 2, 3, 4, 3)

    val s = mutableListOf<Int>()

    var index = 0
    n.forEach {
        if (it != (index + 1)) {
            s.add(it)
            s.add(index + 1)
        }

        index++
    }

    println(s)

}