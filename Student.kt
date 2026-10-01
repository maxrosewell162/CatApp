class Student (val id: String, var name: String, var course: String, val mark: Int) {

    override fun toString() : String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}