package com.linggash.basickotlinandroid

import org.junit.Assert
import org.junit.Test

// made for unitTest practice

class HelloTest {

    @Test
    fun testSayHello() {
        val result = Hello.sayHello("Lingga")

        Assert.assertEquals("Hello Lingga", result)
    }
}