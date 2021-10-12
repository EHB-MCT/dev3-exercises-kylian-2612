fun main(){
    println("Well hi there thrall, this is what you'll be called from now on. you're a slave for earl Björn Ironsight, " +
            "Son of Ragnar Lothbrok. In this adventure you will try your best to become a karl and earn your own freedom so " +
            "maybe one day you can have your own family and farm.")
    challengeOne()
}

fun challengeOne() {
    val optionsRiddle = setOf("Björn", "Ivar", "Hvisterk")
    val playerChoice = readLine()
    println(
        "For your first task in this journey you'll have to solve the following " +
                " riddle: Who was the firstborn son of Ragnar Lothbrok"
    )
    if(optionsRiddle.contains(playerChoice)){
        success()
        challengeTwo()
    } else{
        gameOver()
    }

}

fun gameOver() {
    val playerChoice = readLine()
    val correctAnswer = "Björn"
    if (playerChoice != correctAnswer) {
        println(
            "You've lost your first challenge allready, get ready to clean" +
                    "and be a slave for the rest of your life."
        )
        return
    }
}

fun success() {
    val playerChoice = readLine()
    val correctAnswer = "Björn"
    if (playerChoice == correctAnswer) {
        println(
            "yess my man this is the right answer, you can now enter" +
                    " the second challenge which will bring you one step closer to freedom"
        )
    }
}

fun challengeTwo(){
}
