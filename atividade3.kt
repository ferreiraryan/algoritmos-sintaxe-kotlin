fun main() {
    println("digite um número:")
    val numero = readLine()?.toIntOrNull()
    println("digite o segundo número:")
    val numero2 = readLine()?.toIntOrNull()
    if(numero != null && numero2 != null){
        val soma = numero + numero2
        println("$numero + $numero2 =  $soma")
    }
    else{
        print("Digite um numero inteiro!")
    }

}