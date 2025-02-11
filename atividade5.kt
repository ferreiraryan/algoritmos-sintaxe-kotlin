fun main() {
    println("Digite um valor em metros:")
    val metro = readLine()?.toIntOrNull()
    if(metro != null){
        val cent = metro * 100
        println("O número em centimetros é: $cent")
    }
    else
    {
        println("Digite apenas um numero inteiro!")
    }


}