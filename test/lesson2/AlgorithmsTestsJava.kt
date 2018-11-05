package lesson2

import org.junit.jupiter.api.Tag
import kotlin.test.Test
import kotlin.test.assertEquals

class AlgorithmsTestsJava : AbstractAlgorithmsTests() {
    @Test
    @Tag("Easy")
    fun testOptimizeBuyAndSell() {
        optimizeBuyAndSell { JavaAlgorithms.optimizeBuyAndSell(it) }
    }

    @Test
    @Tag("Easy")
    fun testJosephTask() {
        josephTask { menNumber, choiceInterval -> JavaAlgorithms.josephTask(menNumber, choiceInterval) }
    }

    @Test
    @Tag("Normal")
    fun testLongestCommonSubstring() {
        longestCommonSubstring { first, second -> JavaAlgorithms.longestCommonSubstring(first, second) }
    }

    @Test
    @Tag("Easy")
    fun testCalcPrimesNumber() {
        calcPrimesNumber {
            JavaAlgorithms.calcPrimesNumber(it)
        }
    }

    @Test
    @Tag("Easy")
    fun testCalcPrimesNumbers2() {
        assertEquals(168, JavaAlgorithms.calcPrimesNumber(1000))
    }

    @Test
    @Tag("Easy")
    fun testCalcPrimesNumbers3() {
        assertEquals(1229, JavaAlgorithms.calcPrimesNumber(10000))
    }

    @Test
    @Tag("Hard")
    fun testBaldaSearcher() {
        baldaSearcher { inputName, words -> JavaAlgorithms.baldaSearcher(inputName, words) }
    }
}