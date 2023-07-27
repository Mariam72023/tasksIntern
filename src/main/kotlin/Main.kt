
class Student(val name:String, val subjects:List<Subject>) {
    fun totalGrades(): Int {
        var totalgrade = 0
        for (elemnt in subjects) {
            totalgrade += elemnt.grade
        }
        return totalgrade
    }


override fun toString():String{
    return "{Student name : $name,TotalGrades:${totalGrades()}}"
}
   fun isPassed():Boolean{
      var num= subjects.count { it.grade<50 }
       return num<3
   }

}
data class Subject (var name :String,var grade:Int)


fun main(args: Array<String>) {
var students=listOf(
    Student("mariam", listOf(Subject("English",100),Subject("franch",70)
        ,Subject("Math",80))),
    Student("mera", listOf(Subject("English",40),Subject("frensh",30),
        Subject("Math",30))),
    Student("sama", listOf(Subject("English",80),Subject("frensh",90),
        Subject("french",60)  )))

  var passedStudents=students.filter{it.isPassed()}
var sortedStudent=passedStudents.sortedBy { it.totalGrades() }
sortedStudent.forEach { println(it) }

}