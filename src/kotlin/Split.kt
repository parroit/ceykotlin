//this is working
class Split(val string:String, val char:Char=':')          {
    val index = string.indexOf(char)
    val first=string.get(0,index)
    val rest=string.get(index+1,string.size)
}
fun main(args:Array<String>){
    val split = Split("hi:community");
    println(split.first)
    println(split.rest)
}



//This is what I would have preferred to write:
/*
class Split(val string:String, val char:Char=':'){
    val index = string.indexOf(char)
    val #{first,rest}=#{string.get(0,index),string.get(index+1,string.size)}
}

fun main(args:Array<String>){
    val split = Split("hi:community");
    println(split.first)
    println(split.rest)
}
*/

