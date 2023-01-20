fun main() {

    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {


    var message =
        if (numberOfMessages < 100)
            "You have $numberOfMessages notifications."
         else
            "You phone is blowing up! You have 99+ notifications."

    message = when(numberOfMessages < 100){
        true -> "You have $numberOfMessages notifications."
        false -> "You phone is blowing up! You have 99+ notifications."
    }
    message = when{
        (numberOfMessages < 100) -> "You have $numberOfMessages notifications."
        else -> "You phone is blowing up! You have 99+ notifications."
    }
    println(message)
}
