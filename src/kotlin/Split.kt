
class Split(val string:String, val char:Char=':')/* : #{first:String,rest:String} */{
    val index = string.indexOf(char)
    val first=string.get(0,index)
    val rest=string.get(index+1,string.size)
}
fun main(args:Array<String>){
    val split = Split("hi:community");
    println(split.first)
    println(split.rest)
}
