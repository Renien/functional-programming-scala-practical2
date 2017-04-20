//trait example
//human

//animal

//dog

//cat

trait Friend {
  val name: String
  def listen() = println(s"I'm $name listening")
}

class Human(val name: String) extends Friend
val roy = new Human("Roy")
roy.listen()

class Animal(val name: String)
class Dog(override val name: String) extends Animal(name)
with Friend
val bruno = new Dog("Bruno")
bruno.listen()

//Taking to decorator pattern

class Cat(override val name: String) extends Animal(name)

//val black = new Cat("black")
//black.listen()

val black = new Cat("black") with Friend
black.listen()

def seekHelp(friend: Friend) = {
  friend.listen()
}

seekHelp(roy)
seekHelp(bruno)
//seekHelp(new Cat("black"))