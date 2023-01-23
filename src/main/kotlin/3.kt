private fun main() {
    print(lengthOfLongestSubstring(" "))
}

private fun lengthOfLongestSubstring(s: String): Int {
    var result = 0
    val set = mutableSetOf<Char>()
    for (i in s.indices) {
        if (set.contains(s[i])) {
            with(set.size) {
                if (this > result) result = this
            }
            set.clear()
        }
        set.add(s[i])
    }
    return result
}