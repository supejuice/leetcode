fun main() {
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return (l1.toLong() + l2.toLong()).toListNode()
}


fun ListNode?.toLong(placeValue: Long = 1L): Long {
    this ?: return 0
    return if (next == null)
        `val` * placeValue
    else `val` * placeValue + next!!.toLong(placeValue * 10L)
}

fun Long.toListNode(divisor: Int = 10): ListNode? {
    if (this == 0L) return ListNode(0)
    val digit = this % divisor
    val remainingDigits = this / divisor
    val next = if (remainingDigits > 0) (remainingDigits).toListNode() else null
    val node = ListNode(digit.toInt())
    node.next = next
    return node
}