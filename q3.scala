object stringConverter{

 def toUpper(word : String): String = {
    word.toUpperCase
 }

 def toLower(word : String): String = {
    word.toLowerCase
 }   

 def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
 }

 def main(args: Array[String]): Unit={
    println("\n")
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2).toLowerCase))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => name.take(1).toLowerCase + name.take(5).drop(1).toLowerCase + name.drop(5).toUpperCase))
    println("\n")
 }
}