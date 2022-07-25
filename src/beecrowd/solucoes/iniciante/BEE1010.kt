package beecrowd.solucoes.iniciante
import java.util.Scanner

    /*

    Questão Cálculo Simples

    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

    Entrada
    O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e
    um valor com 2 casas decimais.

    Saída
    A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e
    um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

    Exemplos de Entrada: 12 1 5.30
                         16 2 5.10

    Exemplos de Saída: VALOR A PAGAR: R$ 15.50
     */
fun main(args: Array<String>) {

    val leitor = Scanner(System.`in`)

    val p1: Int = leitor.nextInt()
    val np1: Int = leitor.nextInt()
    val vp1: Double = leitor.nextDouble()

    val p2: Int = leitor.nextInt()
    val np2: Int = leitor.nextInt()
    val vp2: Double = leitor.nextDouble()

    val valorTotal = (np1 * vp1) + (np2 * vp2)

    println("VALOR A PAGAR: R$ ${"%.2f".format(valorTotal)}")
}