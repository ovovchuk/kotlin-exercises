package com.training.ex6

import org.junit.Assert.*
import org.junit.Test
import java.util.HashMap

class BuildMapKtTest {
    @Test
    fun testBuildMap() {
        val map = task37()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        assertEquals("Map should be filled with the right values", expected, map)
    }
}