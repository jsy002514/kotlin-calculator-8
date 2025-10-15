package calculator

import java.util.regex.Pattern

class NumberExtractor {
    companion object{
        private const val CUSTOM_DELIMETER_REGEX = "//(.*)\n(.*)"
        private val pattern: Pattern = Pattern.compile(CUSTOM_DELIMETER_REGEX)
    }
    fun extract(text: String?) : List<String>{
        if(text.isNullOrBlank()){
            return emptyList()
        }

        val delimeter = mutableListOf(",",":")
        var numberstring = text

        val matcher = pattern.matcher(text)
        if(matcher.find()){
            val customdelimeter = matcher.group(1)
            delimeter.add(customdelimeter)
            numberstring = matcher.group(2)
        }

        return numberstring.split(*delimeter.toTypedArray())
    }
}