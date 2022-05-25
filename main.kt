import java.io.File
import java.io.InputStreamReader
import java.io.BufferedReader
import java.net.URL


fun main(args: Array<String>) {
    
    getRequest()

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
    var env1: String = System.getenv("userprofile")
    var env2: String = System.getenv("userdomain")
    println(env)
    println(env1)
    println(env2)
}

fun fileIo(){
    File("miarchivo.txt").writeText("Este es mi primer File I/O")

    File("miarchivo.txt").forEachLine { println(it) }
}

fun getRequest(){
    val url = URL("https://jsonplaceholder.typicode.com/posts/1")
    val connection = url.openConnection()

    BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
        var line: String?
        while (inp.readLine().also { line = it } != null) {
            println(line)
        }

    }
}