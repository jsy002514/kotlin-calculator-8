// calculator/NumberParser.kt

package calculator

import java.lang.NumberFormatException

class NumberParser {
    private val numberRegex = Regex("^[0-9]+$")

    fun parse(strings: List<String>): List<Long> {
        return strings
            .filter { it.isNotEmpty() }
            .map { parseSingleString(it) }
    }

    private fun parseSingleString(str: String): Long {

        if (!str.matches(numberRegex)) {
            throw IllegalArgumentException("유효하지 않은 문자가 포함되어 있습니다: '$str'")
        }

        try {
            return str.toLong()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("숫자가 너무 큽니다: $str")
        }
    }
}