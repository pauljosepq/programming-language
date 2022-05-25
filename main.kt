fun main(args: Array<String>) {
    
    getEV()

}

fun HelloWorld(){
    println("Hello World")
}

fun arguments(args: Array<String>){
    val first = args[0]
    val second = args[1]

    val concat = first + second
    println(concat)
}

fun standardStreams(){

    println("Escribe tu nombre: ")
    val input = readLine()

    println("Su nombre es: " + input)

    System.err.println("$input ya existe")

}

fun getEV(){

    var env: String = System.getenv("username")
}