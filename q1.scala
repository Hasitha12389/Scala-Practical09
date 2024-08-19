object interest{

def interestCalculate(num:Double): Double = num match{
    case x if x > 2000000 => (x*6.5)/100
    case x if x > 200000 => (x*3.5)/100
    case x if x > 20000 => (x*4)/100
    case x if x > 0 => (x*2)/100
    case x if x <= 0 => 0.00
}

def main(args: Array[String]): Unit={
   print("\nEnter your bank amount in Rupees : ")
   val amount = scala.io.StdIn.readDouble()
   if(amount<0){
    println("!!!!!!!!! ERROR !!!!!!!!!!!")
    println("Please enter valid amount.\n")
   } else {
   val interest = interestCalculate(amount)
   println(s"\nYou can get Rs:$interest interest amount from $amount.")
   println("--------------------- Thank you ---------------------\n")
}
}
}