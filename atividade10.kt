fun main() {
    println("Digite a temperatura em celsius:")
    val celsius = readLine()?.toFloatOrNull()

    if (celsius != null){
        val Fahrenheit =  (celsius * 9/5) + 32
        println("$Fahrenheit ° Celsius")
    }
    else{
        println("Valores incorretos")
    }


}