package basic

fun main(args: Array<String>) {
    hello()
    println(toUpper("Higor Almeida Gomes"))
    println(fisrtletter("Celma Almeida Oliveira"))
}

fun hello(){
    println("Hello")
}

fun toUpper(str :String):String{
    return  str.toUpperCase()
}

fun fisrtletter(str: String):Char{
    return str [0]
}
