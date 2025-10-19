// calculator/NumberValidator.kt
package calculator

class NumberValidator {
    // 반환 타입을 Unit으로 변경
    fun validate(numbers: List<Long>) {
        val negativenumbers = numbers.filter { it < 0 }
        if (negativenumbers.isNotEmpty()) {
            throw IllegalArgumentException("음수는 허용되지 않습니다: $negativenumbers")
        }
        // return 문 삭제
    }
}