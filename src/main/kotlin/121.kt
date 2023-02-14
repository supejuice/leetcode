fun main() {
    print(maxProfit(intArrayOf(1, 2)))
}

private fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    for (i in 0 until prices.lastIndex) {
        for (j in i + 1 until prices.size) {
            val profit = prices[j] - prices[i]
            if (profit > maxProfit) maxProfit = profit
        }
    }
    return maxProfit
}