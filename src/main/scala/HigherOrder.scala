object higherOrder{
  def  getSum(num1:Int,num2:Int,f:(Int,Int)=>Int): Int ={
    f(num1,num2)
  }
  def sumSquares(num1:Int,num2:Int) = {
    num1*num1+num2*num2
  }
  def sumCubes(num1:Int,num2:Int)  = {
    num1*num1*num1+num2*num2*num2
  }
  def sumInt(num1:Int,num2:Int,num3:Int=3)= {
    num1 + num2 + num3
  }
  def main(args: Array[String]): Unit = {
    print(higherOrder.getSum(2,3,sumCubes))
  }
}