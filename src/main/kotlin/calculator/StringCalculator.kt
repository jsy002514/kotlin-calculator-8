package calculator

class StringCalculator(
    private val summer: NumberSummer,
    private val extractor: NumberExtractor,
    private val validator: NumberValidator) {
    fun add(text: String?){
        //추출
        val extractedstring = extractor.extract(text)
        //추출한 문자열 확인
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