//class Car(val year: Int, var miles: Int)
//
//val car1 = new Car(2017, 0)

//class Car(val year: Int, var miles: Int) {
//
//  def drive(dist: Int) = {
//    miles += dist
//  }
//}
//
//val car1 = new Car(2017, 0)
//car1.drive(10)
//car1.miles

//Singleton object
class Car(val year: Int, var miles: Int) {
  println("Car created!")
}

//companion object
object Car{
  def create(year: Int) = new Car(year, 0)
  def apply(year: Int) = new Car(year, 0)
}

val car1 = Car.create(2017)
val car2 = Car(2081)
println(car1.year)
println(car2.year)


