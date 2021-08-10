fun main() {
    val amount = 10
    val comission = amount / 100 * 75
    if (comission < 35) {
        comission = 35
    }
    println(comission)
}