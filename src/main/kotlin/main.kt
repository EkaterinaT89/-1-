fun main() {

    val amount: Int = 7_000

    if (amount >= 3_500) {
        val commission = amount / 100 * .075
        println("Размер коммисии $commission")
    } else println("Слишком маленькая сумма!")

}