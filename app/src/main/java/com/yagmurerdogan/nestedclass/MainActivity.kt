package com.yagmurerdogan.nestedclass

/*
 You can watch the lesson -> https://www.youtube.com/watch?v=MPD0KLJX8pU
 Thanks for "Simplified Coding"!
 */

class Box(val width: Int, val length: Int, val height: Int) {

    inner class Content(val content: String) {

        fun printBoxInfo() {
            println("Width: $width, Length: $length, Height: $height")
        }

        fun printContent() {
            println(content)
        }
    }
}

fun main() {
    val box = Box(10,10,10)
    val content = box.Content("Some Content")
    content.printContent()
    content.printBoxInfo()
}