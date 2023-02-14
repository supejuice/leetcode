private fun search(nums: IntArray, target: Int): Int {
    var midIndex = nums.lastIndex / 2
    while (true) {
        val mid = nums[midIndex]
        if (mid == target) return midIndex
        val left = nums.getOrNull(midIndex - 1)
        if (left == target) {
            return midIndex - 1
        }
        if (left != null) if (left > target) {
            midIndex = (midIndex - 1) / 2
            continue
        }
        val right = nums.getOrNull(midIndex + 1)
        if (right == target) {
            return midIndex + 1
        }
        if (right != null) if (right > target) {
            midIndex = (midIndex + 1) / 2
            continue
        }
    }
}

fun main() {
    print(search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
}