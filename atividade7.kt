fun main() {
    println("Digite os lados do quadrado separados por espaço:")
    try {
        val ladosQuadrado = readLine()!!.split(" ").map { it.toInt() }
        if(ladosQuadrado.size == 2){
            val (n1, n2) = ladosQuadrado
            val dobroArea = (n1 * n2) * 2
            println("O dobro da área é $dobroArea")
        }
        else
        {
            println("Digite apenas 2 numeros inteiros")
        }

    } catch (e: NumberFormatException) {
        println("Erro: Você não digitou numeros válidos!")
    }

}