object numeric{

def finder(num : Int): String = num match{
   case x if x <= 0 => "Negative/Zero is input."
   case x if x % 2 == 0 => "Even number is given."
   case _  => "Odd Number is given."
}  

def main(args : Array[String]): Unit = {
    print("\nEnter an Integer : ")
    val num = scala.io.StdIn.readInt()
    val result = finder(num)
    println(s"$result\n")
}
}