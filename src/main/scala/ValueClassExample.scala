class getFirstName(val fname: String) extends AnyVal

class getLastName(val lname: String) extends AnyVal

class getAge(val age: Int) extends AnyVal

object FirstName extends App {

  val fname = new getFirstName("Dinesh")
  val lname = new getLastName("Choudhari")
  val age = new getAge(21)
  FirstName.displayDetails(fname, lname, age)

  def displayDetails(fname: getFirstName, lname: getLastName, age: getAge): Unit = {
    println(fname.fname + " " + lname.lname + "  is of  " + age.age + "  years old")
  }
}