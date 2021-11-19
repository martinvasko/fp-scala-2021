object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

val newId: Int = IdFactory.create()
println(newId) 
val newerId: Int = IdFactory.create()
println(newerId)