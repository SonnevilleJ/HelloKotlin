@file:JvmName("app")

fun main(args: Array<String>) {
    val greeter = Greeter()
    args.map {
        println(greeter.greet(it))
    }
}
