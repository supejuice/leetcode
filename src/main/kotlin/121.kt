fun main() {
    print(maxProfit(intArrayOf(1, 2)))
}

private fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var lowestPrice = prices.first()
    prices.forEach { price ->
        if (price < lowestPrice) lowestPrice = price
        val profit = price - lowestPrice
        if (profit > maxProfit) maxProfit = profit
    }
    return maxProfit
}