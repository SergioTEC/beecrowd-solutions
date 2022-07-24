package beecrowd.solucoes.iniciante

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

    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    Questão BEECROWD 1010 apresenta Runtime error no beecrowd
    RUNTIME ERROR

    Exception in thread "main" java.lang.NumberFormatException: For input string: "12 2 5.30"
    at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.lang.Integer.parseInt(Integer.java:580)
    at java.lang.Integer.parseInt(Integer.java:615)
    at MainKt.main(Main.kt:5)


     */

fun main(args: Array<String>) {

    val p1 = readLine()!!.toInt()
    val np1 = readLine()!!.toInt()
    val vp1 = readLine()!!.toDouble()

    val p2 = readLine()!!.toInt()
    val np2 = readLine()!!.toInt()
    val vp2 = readLine()!!.toDouble()

    val valorTotal = np1 * vp1 + np2 * vp2

    println("VALOR A PAGAR: R$ ${"%.2f".format(valorTotal)}")
}