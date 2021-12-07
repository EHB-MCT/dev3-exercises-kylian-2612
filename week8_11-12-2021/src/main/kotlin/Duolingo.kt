class Duolingo(val roundSize : Int = 5,
               val language : String = "en") {



    var words = mutableSetOf<Word>(
        EnglishWord("ziekenwagen", "Ambulance"),
        DeutschWord("ziekenwagen", "krankenwagen"),
        EnglishWord("vlinder", "butterfly"),
        DeutschWord("vlinder", "Schmetterling"),
        EnglishWord("kaas", "cheese"),
        DeutschWord("kaas", "Käse"),
        EnglishWord("pannenkoek", "pancake"),
        DeutschWord("pannenkoek", "pfannkuchen"),
        EnglishWord("auto", "car"),
        DeutschWord("auto", "kraftwagen")

        )
    init {
        words = words.filter{ it.language == language }.toMutableSet()
    }


    fun play(){
        val randomWords = words.shuffled().take(roundSize).toMutableSet()

        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
            println(selectedWord.original)
            val userAnswer = readLine()

            if(userAnswer == selectedWord.translated){
                randomWords.remove(selectedWord)
                println("jeey")

            } else {
                println("jammer het juiste woord is: ${selectedWord.translated}. probeer nog eens")
            }
            println("nog ${randomWords.count()} te gaan")

        }
    }
}

