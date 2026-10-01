fun main() {
    val students = mutableListOf<Student>()

    while (true) {
        println("Enter student ID (or type 'quit' to finish):")
        val id = readln()
        if (id.lowercase() == "quit") {
            break
        }

        println("Enter your name:")
        val name = readln()
        println("Enter your course:")
        val course = readln()
        println("Enter your mark:")
        val mark = readln().toInt()
        val student = Student(id, name, course, mark)
        students.add(student)
    }
    println()
    println("Students entered:")
    for (student in students) {
        println(student)
    }
}