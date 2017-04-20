def totalPrices(prices: List[Int]) = {
  var total = 0
  for(price <- prices) {
    total += price
  }
  total
}

def totalPricesOver25(prices: List[Int]) = {
  var total = 0
  for(price <- prices) {
    if(price > 25) total += price
  }
  total
}

//Higher order function
def totalPricesNew(prices: List[Int],
                   selector: Int => Boolean) = {
  var total = 0
  for(price <- prices) {
    if(selector(price)) total += price
  }
  total
}


val prices = List(10, 15, 20, 25, 30, 35, 40)
println(totalPrices(prices))
println(totalPricesOver25(prices))
println(totalPricesNew(prices, { p => true }))
println(totalPricesNew(prices, { p => p > 25 }))