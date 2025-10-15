package calculator

class NumberParser() {
    fun parse(strings: List<String>):List<Long>{
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