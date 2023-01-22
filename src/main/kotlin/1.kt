fun main() {
    val result = twoSum(intArrayOf(3, 2, 4), 6)
    result.forEach {
        print(it)
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}
fun twoSum2(nums: IntArray, target: Int): IntArray? {
    val numToIndex: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        if (numToIndex.containsKey(target - nums[i])) {
            return intArrayOf(numToIndex[target - nums[i]]!!, i)
        }
        numToIndex[nums[i]] = i
    }
    return intArrayOf()
}