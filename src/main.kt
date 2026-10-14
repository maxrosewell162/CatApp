fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk(12)
    clyde.walk(23)
    binnie.eat(12)
    clyde.eat(15)
    println(binnie)
    println(clyde)
}