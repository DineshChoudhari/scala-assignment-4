package Queue
import scala.io
import scala.io.StdIn
import Queue.QueueOperation
import Queue.SquareQueue

class DoubleQueue {
  def doubleNum(num:Int): Int ={
    val total=num+num
    dq1.enqueue(total,list)
  }

  def main(args: Array[String]): Unit = {

    var dq1=new DoubleQueue()

    var list=List(1,2,3,4,5)

    val length=list.length
    dq1.DoubleNum(5)
    }
  }
