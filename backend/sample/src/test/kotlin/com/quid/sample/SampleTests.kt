package com.quid.sample

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

class SampleTests {

    @Test
    fun add(){
        val sample = Sample()
        assertEquals(3, sample.add(1, 2))
    }

    @Test
    fun subtract(){
        val sample = Sample()
        assertEquals(1, sample.subtract(3, 2))
    }

}
