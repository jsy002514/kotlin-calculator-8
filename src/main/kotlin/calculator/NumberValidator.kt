package calculator

class NumberValidator {
    fun validate(numbers: List<Long>){
        val negativenumbers = numbers.filter { it < 0 }
        if(negativenumbers.isNotEmpty()){
            throw IllegalArgumentException("음수는 허용되지 않습니다: $negativenumbers")
        }
    }
}