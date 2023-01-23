private fun main() {
    val result = twoSum(intArrayOf(3, 2, 4), 6)
    result.forEach {
        print(it)
    }
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}