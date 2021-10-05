fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("computer picked $computerChoice")
    println("user picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>):String?{
    var userChoice: String?
    do {
        println("Make your choice: rock - paper - scissors")
        userChoice = readLine()
    } while (!options.contains(userChoice))

    return  userChoice
}

fun determineWinner(computerChoice: String, userChoice:String?){
    if(computerChoice == userChoice){
        println("It's a draw")
        return
    }

    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when(computerChoice){
        "rock" -> if(userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if(userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> if(userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}