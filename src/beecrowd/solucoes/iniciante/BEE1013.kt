package beecrowd.solucoes.iniciante

import java.util.*

    /*

    Questão O Maior

    Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
    Utilize a fórmula: MaiorAB = (a+b+abs(a - b))/2

    Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
    para chegar no resultado esperado.

    Entrada
    O arquivo de entrada contém três valores inteiros.

    Saída
    Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

    Exemplos de Entrada: 7 14 106

    Exemplos de Saída: 106 eh o maior

    "Não sei porque colocaram eh ao invés de é"

     */

fun main(args: Array<String>) {

    val leitor = Scanner(System.`in`)

    val a = leitor.nextInt()
    val b = leitor.nextInt()
    val c = leitor.nextInt()

    if (a > b && a > c) {
        println("$a eh o maior")
    } else if (b > c) {
        println("$b eh o maior")
    } else {
        println("$c eh o maior")
    }
}