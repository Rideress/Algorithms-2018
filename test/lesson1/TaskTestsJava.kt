package lesson1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Tag
import java.io.File
import kotlin.test.Test

class TaskTestsJava : AbstractTaskTests() {

    @Test
    @Tag("Easy")
    fun testSortTimes() {
        sortTimes { inputName, outputName -> JavaTasks.sortTimes(inputName, outputName) }
    }

    @Test
    @Tag("Easy")
    fun testSortTimes2() {
        val wr = File("tmpIn").writeText("""
            00:12:24
            2000:00
            13:69:24
        """.trimIndent())
        try {
            JavaTasks.sortTimes("tmpIn", "tmpOut")
            Assertions.fail<IllegalAccessError>()
        } catch (ex: IllegalAccessError) {
            File("tmpIn").delete()
        }
    }

    @Test
    @Tag("Normal")
    fun testSortAddresses() {
        sortAddresses { inputName, outputName -> JavaTasks.sortAddresses(inputName, outputName) }
    }

    @Test
    @Tag("Normal")
    fun testSortTemperatures() {
        sortTemperatures { inputName, outputName -> JavaTasks.sortTemperatures(inputName, outputName) }
    }

    @Test
    @Tag("Normal")
    fun testSortSequence() {
        sortSequence { inputName, outputName -> JavaTasks.sortSequence(inputName, outputName) }
    }

    @Test
    @Tag("Easy")
    fun testMergeArrays() {
        val result = arrayOf(null, null, null, null, null, 1, 3, 9, 13, 18, 23)
        JavaTasks.mergeArrays<Int>(arrayOf(4, 9, 15, 20, 23), result)
        assertArrayEquals(arrayOf(1, 3, 4, 9, 9, 13, 15, 18, 20, 23, 23), result)

        run {
            val (first, second, expectedResult) = generateArrays(20000, 20000)
            JavaTasks.mergeArrays<Int>(first, second)
            assertArrayEquals(expectedResult, second)
        }

        run {
            val (first, second, expectedResult) = generateArrays(500000, 500000)
            JavaTasks.mergeArrays<Int>(first, second)
            assertArrayEquals(expectedResult, second)
        }
    }

    @Test
    @Tag("Easy")
    fun testMergeArrays2() {
        val result = arrayOf(null, null, null, null, 49, 120, 300, 576, 613, 877, 899)
        JavaTasks.mergeArrays<Int>(arrayOf(46, 49, 120, 323), result)
        assertArrayEquals(arrayOf(46, 49, 49, 120, 120, 300, 323, 576, 613, 877, 899), result)

        run {
            val (first, second, expectedResult) = generateArrays(5000, 5000)
            JavaTasks.mergeArrays<Int>(first, second)
            assertArrayEquals(expectedResult, second)
        }

        run {
            val (first, second, expectedResult) = generateArrays(500, 500)
            JavaTasks.mergeArrays<Int>(first, second)
            assertArrayEquals(expectedResult, second)
        }
    }

}