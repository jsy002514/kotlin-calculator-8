package calculator

class StringCalculator(
    private val summer: NumberSummer,
    private val extractor: NumberExtractor,
    private val validator: NumberValidator,
    private val parser: NumberParser) {
    fun add(text: String?) : Long{
        val extractedstring = extractor.extract(text)
        val parsednumbers = parser.parse(extractedstring)

        // validate 함수는 이제 아무것도 반환하지 않으므로, 변수에 담을 필요 없음
        validator.validate(parsednumbers)

        // 검증을 통과했으므로 원본 parsednumbers를 사용
        return summer.sum(parsednumbers)
    }
}