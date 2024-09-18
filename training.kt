fun strLength(notNull: String): Int {                   
    return notNull.length
}

fun main(){
    val str = "Hello, World!"
    val length = strLength(str)
    println("Length of string is $length")
}