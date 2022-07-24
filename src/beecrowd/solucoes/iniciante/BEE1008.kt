package beecrowd.solucoes.iniciante

    /*
    Questão Salário

    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e
    calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

    Entrada
    O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de
    horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

    Saída
    Imprima o número eo salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade.
    No caso do salário, também deve haver um espaço em branco após o $.

    Exemplos de Entrada: 25, 100 e 5.50
    Exemplos de Saída: NUMBER = 25 e SALARY = U$ 550.00
     */

fun main(args: Array<String>) {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toDouble()

    val salario = b * c

    println("NUMBER = $a")
    println("SALARY = U$ ${"%.2f".format(salario)}")
}