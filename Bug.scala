```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.value) // Output: 0

class AnotherClass(var value: Int) {
  def this() = {
    this(0) 
    value = 10 // Attempt to modify a val parameter in aux constructor
  }
}

val anotherInstance = new AnotherClass()
println(anotherInstance.value) // This will compile but results in unexpected value
```