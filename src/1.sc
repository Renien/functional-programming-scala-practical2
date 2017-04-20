//Statistically typed language
//More statistically type langauage than java

val numbers = List(1, 2, 3, 4, 5, 6)

var total = 0

//Imperative style
for(e <- numbers) {
  total += e
}

//Functional style of codding
// we lean more toward
// declarative style of coding than
// imperative

println(
  numbers.foldLeft(0) { (c, e) => c + e }
)