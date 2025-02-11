fun main() {
    println("Digite quanto voce ganha por hora:")
    val ganhoHora = readLine()?.toFloatOrNull()
    println("Digite quantas horas voce trabalhou esse mes:")
    val horasTrabalhadas = readLine()?.toFloatOrNull()
    if (ganhoHora != null && horasTrabalhadas != null){
        val ganhoMes = ganhoHora * horasTrabalhadas
        println("Seu salário será: $ganhoMes")
    }
    else{
        println("Valores incorretos")
    }


}