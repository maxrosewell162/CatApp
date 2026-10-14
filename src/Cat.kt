class Cat (private val name: String, private var age: Int, var weightIn: Int){
    var weight = weightIn 
    private set 
    // Function for walking, which decreases weight by distance walked, but not below 5 
    public fun walk(distance: Int) : Boolean 
    { 
        if(weight - distance >= 5) 
    { 
        weight -= distance 
        return true 
    } 
    return false } 
    // Function for eating, which increases weight by food eaten, but not above 20 
    public fun eat(food: Int) : Boolean 
    { 
        if(weight + food <= 20) 
    { 
            weight += food 
            return true 
            } 
        return false } 
        
    // Function for returning a string representation of the cat's name, age, and weight 
    public override fun toString() : String { 
        return "Name: $name Age: $age Weight: $weight" } }