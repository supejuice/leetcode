fun main() {
    print(isValid("(])"))
}

private fun isValid(s: String): Boolean {
    val openings = arrayListOf<Char>()
    for (i in s.indices) {
        val char = s[i]
        if (char.isOpening()) {
            openings.add(char)
        } else {
            val lastOpening = openings.lastOrNull() ?: return false
            if (char.closes(lastOpening))
                openings.removeLast()
            else return false
        }
    }
    return openings.isEmpty()
}

private fun Char.isOpening(): Boolean {
    return when (this) {
        '{' -> true
        '[' -> true
        '(' -> true
        else -> false
    }
}

private fun Char.closes(opening: Char): Boolean {
    return (opening == '(' && this == ')') ||
            (opening == '[' && this == ']') ||
            (opening == '{' && this == '}')
}
