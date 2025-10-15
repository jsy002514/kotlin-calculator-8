package calculator

class StringCalculator(
    private val summer: NumberSummer,
    private val extractor: NumberExtractor,
    private val validator: NumberValidator) {
    fun add(text: String?) : Long{
        //추출
        val extractedstring = extractor.extract(text)
        //추출한 문자열 확인
        val checkedstring = checkNumbers(extractedstring)
        //숫자 리스트 규칙에 맞는지 확인
        val validatednumbers = validator.validate(checkedstring)
        //숫자 더하기
        return summer.sum(validatednumbers)
    }
    private fun checkNumbers(strings: List<String>):List<Long>{
        return strings
            .filter { it.isNotEmpty() }
            .map { str ->
                try{
                    str.toLong()
                }catch (e: NumberFormatException){
                    throw IllegalArgumentException("숫자 형식에 맞지 않거나 너무 큰 숫자입니다: $str")
                }
            }
    }
}