import java.math.BigInteger

fun main() {
//    val result = addTwoNumbers(342.toListNode(), 465.toListNode())
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return (l1.toBigInt() + l2.toBigInt()).toListNode()
}

fun ListNode?.toBigInt(multiplier: BigInteger = BigInteger.ONE): BigInteger {
    this ?: return BigInteger.ZERO
    val placevalue = multiplier.multiply(`val`.toBigInteger())
    return if (next == null)
        placevalue
    else placevalue + next!!.toBigInt(multiplier * BigInteger.TEN)
}

fun BigInteger.toListNode(divisor: BigInteger = BigInteger.TEN): ListNode? {
    if (this == BigInteger.ZERO) return ListNode(0)
    val digit = this.divide(divisor)
    val remainingDigits = this / divisor
    val next = if (remainingDigits > BigInteger.ZERO) (remainingDigits).toListNode() else null
    val node = ListNode(digit.toInt())
    node.next = next
    return node
}