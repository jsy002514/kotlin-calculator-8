package calculator

fun main() {
    //사용자에게 입력을 요청하는 안내문을 출력하고 문자열을 입력받는다
    println("덧셈할 문자열을 입력해주세요.")
    val userinput = camp.nextstep.edu.missionutils.Console.readLine()
    if(userinput == null){
        return
    }
    //계산기 객체를 생성한다
    val calculator = StringCalculator(
        NumberSummer(),
        NumberExtractor(),
        NumberValidator(),
        parser = NumberParser()
    )
    //계산기 객체로부터 결과를 전달받고 알맞은 출력문을 출력한다
    val result = calculator.add(userinput)
    println("결과 : $result")
}
