package beecrowd.solucoes.iniciante

fun main(args: Array<String>) {

    val raio = readLine()!!.toDouble()
    val area = 3.14159 * (raio * raio)

    println("A=${"%.4f".format(area)}")
}