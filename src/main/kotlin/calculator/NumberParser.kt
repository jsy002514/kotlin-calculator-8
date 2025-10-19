// calculator/NumberParser.kt

package calculator

import java.lang.NumberFormatException

class NumberParser {
    fun parse(strings: List<String>): List<Long> {
        return strings
            .filter { it.isNotEmpty() }
            .map { parseSingleString(it) }
    }


    private fun parseSingleString(str: String): Long {
        try {
            return str.toLong()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("유효하지 않은 문자가 포함되어 있습니다: '$str'")
        }
    }
}