fun main() {
    println("Digite o raio da circunferencia:")
    val raio = readLine()?.toFloatOrNull()
    if (raio != null){
        val area = (raio * raio) * 3.14
        println("A área é: $area")
    }
    else{
        println("Digite a área")
    }


}