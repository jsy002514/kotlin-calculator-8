package calculator

class StringCalculator(
    private val summer: NumberSummer,
    private val extractor: NumberExtractor,
    private val validator: NumberValidator,
    private val parser: NumberParser) {
    fun add(text: String?) : Long{
        //추출
        val extractedstring = extractor.extract(text)
        //추출한 문자열 확인
        val parsednumbers = parser.parse(extractedstring)
        //숫자 리스트 규칙에 맞는지 확인
        val validatednumbers = validator.validate(parsednumbers)
        //숫자 더하기
        return summer.sum(validatednumbers)
    }
}