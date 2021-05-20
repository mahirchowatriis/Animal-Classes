open class Animal() {
  	open val image = ""
  	open val food = ""
  	open val habitat = ""
  	var hunger = 10
  	 
  	open fun makeNoise() {
  	println("The Animal is making a noise")
  	}
  	 
  	open fun eat() {
  	println("The Animal is eating")
  	}
  	 
  	open fun roam() {
  	println("The Animal is roaming")
  	}
  	 
  	fun sleep() {
  	println("The Animal is sleeping")
  	}
}

class Hippo() : Animal(){
  	 
  	override fun makeNoise() {
  	println("*Hippo Noises*")
  	}
  	 
  	override fun eat() {
  	println("The Hippo is eating")
  	}
}

class Wolf() : Animal(){
  	 
  	override fun makeNoise() {
  	println("*Wolf Noises*")
  	}
  	 
  	override fun eat() {
  	println("The Wolf is eating")
  	}
}


fun main() {
	var wolf = Wolf()
	var hippo = Hippo()
	hippo.makeNoise()
	wolf.eat()
}