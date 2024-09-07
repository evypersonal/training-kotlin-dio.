# training-kotlin-dio.

 Repository created for Kotlin language studies focused on the back-end area.

## Introduction to Kotlin

<blockquote>
 Kotlin is a modern and concise programming language developed by JetBrains that stands out for its full interoperability with Java and its expressive, safe syntax. Designed to enhance developer productivity, Kotlin features type inference, extension functions, and support for both functional and object-oriented programming. The language aims to reduce boilerplate code and prevent common errors, such as null pointer exceptions, through its nullable type system. Kotlin is widely adopted in Android app development and backend environments, proving to be a versatile and powerful choice for various platforms.
</blockquote> 

![](https://miro.medium.com/v2/resize:fit:1000/1*yduce6FO0VxRVHvaKL0-qg.jpeg)
## Why Kotlin? 

<blockquote>
 The Kotlin Multiplatform technology is designed to simplify the development of cross-platform projects. It reduces time spent writing and maintaining the same code for different platforms while retaining the flexibility and benefits of native programming.
</blockquote>

-> `Concise` : language with little verbiage and easy to understand;<br>
-> `Safe` : elements and tools that bring security to the code;<br>
-> `Expressive` : expressible and more readable code;<br>
-> `Interoperable` : compatible with multiple languages and frameworks;<br>
-> `Multiplatform` : <br>

 ![](https://kotlinlang.org/docs/images/kotlin-multiplatform.svg)

## Install Kotlin

Kotlin is included in each [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) and [Android Studio](https://developer.android.com/studio?hl=pt-br) release. Download and install one of these IDEs to start using Kotlin.<br>
Compiler for the hardcore -> [Kotlin Compiler](https://github.com/JetBrains/kotlin/releases/download/v2.0.0/kotlin-compiler-2.0.0.zip). <br>
In addition to the possibility of coding without IDE, through [Playground](https://play.kotlinlang.org/?_gl=1*1la0dm5*_gcl_au*MTEyMDg5NjQyMy4xNzI1NTQ4NzQz*_ga*MzgzNTY0MDcwLjE3MjU1NDg3Mzk.*_ga_9J976DJZ68*MTcyNTYyNTUwMS4yLjEuMTcyNTYyNjU5Mi42MC4wLjA.#eyJ2ZXJzaW9uIjoiMi4wLjIwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuZnVuIG1haW4oKSB7XG4gICAgbnVtYmVyID0gMTA7XG5cdHN0cmluZyhudW1iZXIpO1xufVxuXG5mdW4gc3RyaW5nKCl7XG4gICAgaWYobnVtKVxufSJ9).

## Particularities of the Kotlin language

#### Example of a program to print "Hello, World!"

 ~~~kotlin
 fun main(){
    println("Hello, World!")
    // Hello, World!
 }
 ~~~

<details>
 - fun is used to declare a function;<br>
 - The main(  ) function is where your program starts from;<br>
 - The body of a function is written within curly braces {  };<br>
 - println(  ) and print(  ) functions print their arguments to standard output;
</details>
<hr>

#### Declaration of Variables 

###### Default Parameter Values and Named Arguments

~~~kotlin
fun printMessage(message: String): Unit {                              
    println(message)
}
~~~
<details>
  - Kotlin functions allow the reception of arguments, and also the type of return expected by the function.<br>
  - Normally, Unit is used for this return.
</details>
<br>

~~~kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") { 
    println("[$prefix] $message")
}
~~~
<details>
  - It is also possible to assign a value if it is not passed as a parameter.<br>
  - It is not necessary to do concatenation for interpolation of variables.
</details>
<br>

~~~kotlin
fun sum(x: Int, y: Int): Int {                                          
    return x + y
}
~~~
<details>
  - In this case, the return type expected by this function was passed.
</details>
<br>

~~~kotlin
fun multiply(x: Int, y: Int) = x * y
~~~
<details>
  - In this case, the return was passed in the expected return type
</details>
<br>

~~~kotlin
fun main() {
    printMessage("Hello")                                                                  
    printMessageWithPrefix("Hello", "Log")                             
    printMessageWithPrefix("Hello")                                     
    printMessageWithPrefix(prefix = "Log", message = "Hello")           
    println(sum(1, 2))                                                  
    println(multiply(2, 4))                                             
}
~~~
<details>
  - our main function, which calls the previous functions, passing the values ​​as parameters.
</details>
<br>

#### References
[Kotlin Documentation](https://kotlinlang.org/docs/home.html) <br>
[Kotlin Repository](https://github.com/JetBrains/kotlin)
