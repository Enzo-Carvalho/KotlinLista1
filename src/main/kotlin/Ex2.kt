import kotlin.math.pow

fun main() {

    print("Digite o diâmetro do circulo: ")
    val diam = readln().toDouble()
    val raio = diam / 2
    val pi = 3.14
    val area = pi * raio.pow(2)
    val perim = (2 * pi) * raio
    print("Area: ${"%.2f".format(area)}\nPerimetro: ${"%.2f".format(area)}")
}