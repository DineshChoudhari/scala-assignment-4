class Person(val name:String,val age:Int) extends Ordered[Person] {
  def compare (that: Person)={
    if(this.name==that.name)
      this.age-that.age
    else
      this.name.length-that.name.length
  }
}
object Person extends App{
  val person1=new Person("Test",21)
  val person2=new Person("Test ",21)
  val result=person1<person2
  print(result)
}