fun main(args: Array<String>){
    val first: Double=6.0
    val second: Double=3.2
    val divide: Double=first / second

    println(divide)
    floatFunction()
}
fun floatFunction(){
    val a: Float=10.000005f
    val b: Float=5.000006f

    val ans: Float= b % a

    println("The modulus of b and a is:" + ans)

}