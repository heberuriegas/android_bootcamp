fun main(args: Array<String>) {
    var fortune: String? = null
    while(fortune != "Take it easy and enjoy life!") {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    }
}

fun getFortuneCookie() : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
    )
    print("Enter your birthday: ")
    getBirthday(readLine()?.toIntOrNull() ?: 1)

}

fun getBirthday(birthday: Int) : Int {
    return fortunes[birthday % fortunes.size]
}