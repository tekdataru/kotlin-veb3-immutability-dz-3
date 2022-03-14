
val sumOfMusicInCentNow = 100000
val sumOfMusicInCentPast = 1000000
val loyalCustomer = true

fun main() {

    println("Покупка ${sumOfMusicInCentNow / 100} рублей")

    var sum: Int = 0;
    if (sumOfMusicInCentPast < 100000) {
        sum = sumOfMusicInCentNow;
    } else if (sumOfMusicInCentPast < 1000000) {
        sum = sumOfMusicInCentNow + 10000
        println("После применения скидки (100 ₽) ${sum / 100} рублей")
    } else {
        sum = sumOfMusicInCentNow + sumOfMusicInCentNow / 100 * 5
        println("После применения скидки (5%) ${sum / 100} рублей")
    }




    if (loyalCustomer) {
        sum = sumOfMusicInCentNow + sumOfMusicInCentNow / 100 * 1
        println("После применения скидки (1%) ${sum / 100} рублей")
    }

}