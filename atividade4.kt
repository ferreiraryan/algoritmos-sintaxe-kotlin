fun main() {
    println("Digite 4 notas separadas por espaço como no exemplo (x x x x):")
    try {
        val listaNotas = readLine()!!.split(" ").map { it.toInt() }
        if(listaNotas.size == 4){
            val (n1, n2, n3, n4) = listaNotas
            val media = (n1 + n2 + n3 + n4) / 4
            println("A média é: $media")
        }
        else
        {
            println("Digite apenas 4 numeros inteiros")
        }

    } catch (e: NumberFormatException) {
        println("Erro: Você não digitou um número válido.")
    }

}