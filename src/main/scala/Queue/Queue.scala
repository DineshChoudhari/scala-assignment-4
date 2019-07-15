package Queue
import Queue.DoubleQueue

trait QueueOperation{
  def enqueue(element:Int,list): Int ={
    if(list.isEmpty || list<=length)
      {
        list+=list[element]
      }
    else
      {
        println("List out of index")
      }
  }
  def dequeue(list): Int ={
    val delete= List(head)
    if(list.isEmpty)
      {
        println("Enter Element")
      }
    else
      list=list.remove(delete)

  }
}