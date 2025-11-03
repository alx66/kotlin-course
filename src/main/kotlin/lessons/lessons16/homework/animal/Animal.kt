package lessons.lessons16.homework.animal

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Bark")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("Tweet")
    }
}