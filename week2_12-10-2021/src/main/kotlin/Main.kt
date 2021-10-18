fun main(){
    println("Well hi there thrall, this is what you'll be called from now on. you're a slave for earl Björn Ironsight, " +
            "Son of Ragnar Lothbrok. In this adventure you will try your best to become a karl and earn your own freedom so " +
            "maybe one day you can have your own family and farm.")
    challengeOne()
}

fun challengeOne() {
    println(
        "For your first task in this journey you'll have to solve the following " +
                " riddle: Who was the firstborn son of Ragnar Lothbrok"
    )
    val optionsRiddle = setOf("Björn", "Ivar", "Hvisterk")
    val playerChoice = readLine()
    val correctAnswer = "Björn"

    if(optionsRiddle.contains(playerChoice) && playerChoice == correctAnswer){
        println("indeed Björn was the correct answer")
        success()
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
        println(
            "yess my man this is the right answer, you can now enter" +
                    " the second challenge which will bring you one step closer to freedom"
        )
    challengeTwo()
}

fun challengeTwo(){
    println("for your next challenge you'll have to dice")
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low" && (1..3).contains(diceResult)){
        success()
    } else if (userAnswer == "high" && (4..6).contains(diceResult)){
}

fun challengeThree() {
    println("You will have to battle against Ragnar lothbrok himself so choose your weapon wisely")
    val answers = setOf<String>("axe", "speer", "bow and arrow")
    println("What weapon are you gonna use?: axe - speer - bow and arrow")
    val userAnswer = readLine()

    if (userAnswer == "axe") {
        println("Good job! the axe is the the best option for this battle")


    } else if(userAnswer == "speer") {
        println("Ragnar was to close to use the speer, he easily killed you.")
        challengeTwo()
    } else {
        println("you've lost")
        gameOver()
    }
}