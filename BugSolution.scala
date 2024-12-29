```scala
class MyClass(val value: Int) {
  def this() = this(0)
}

val myInstance = new MyClass()
println(myInstance.value) // Output: 0

class AnotherClass(var value: Int) {
  def this() = {
    this(0)   
    this.value = 10 //Correct way to modify var in aux constructor
  }
}

val anotherInstance = new AnotherClass()
println(anotherInstance.value) // Output: 10
```