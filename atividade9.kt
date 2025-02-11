fun main() {
    println("Digite a temperatura em Fahrenheit:")
    val Fahrenheit = readLine()?.toFloatOrNull()

    if (Fahrenheit != null){
        val celsius =  5 * ((Fahrenheit - 32) / 9)
        println("$celsius ° Celsius")
    }
    else{
        println("Valores incorretos")
    }


}