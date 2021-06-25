package com.example.hellowworld

fun main(){
    //Integer types Byte(8 bit), Short(16 bit), Int(32 bit), Long(64 bit)
    val myByte: Byte = 23
    val myShort: Short = 212
    val myInt: Int = 234234234
    val myLong: Long = 234234242342342342

    //Floating point number types: Float(32 bit), Double (64 bit)
    val myFloat: Float = 13.23F
    val myDouble: Double = 234.42342

    //Boolean types
    var isSunny: Boolean = true

    //Char types
    var letterChar: Char = 'A'
    val digitChar: Char = '1'

    //String types

    val myStr: String = "Hello World"
    var firstCharInStr = myStr[0]

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
}