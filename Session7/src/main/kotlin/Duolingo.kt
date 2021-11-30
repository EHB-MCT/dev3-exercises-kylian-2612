class Duolingo {
    private var roundSize: Int = 5
    private var language: String = "en"

    constructor(roundSize: Int, language: String){
        this.roundSize = roundSize
        this.language = language
    }

    val words = mutableSetOf<Word>(
        Word("ziekenwagen", "Ambulance", "en"),
        Word("ziekenwagen", "krankenwagen", "de"),
        Word("vlinder", "butterfly", "en"),
        Word("vlinder", "Schmetterling", "de"),
        Word("kaas", "cheese", "en"),
        Word("kaas", "Käse", "de"),
        Word("pannenkoek", "pancake", "en"),
        Word("pannenkoek", "pfannkuchen", "de"),
        Word("auto", "car", "en"),
        Word("auto", "kraftwagen", "de")

        )

    fun play(){
        val randomWords = words.shuffled().take(5).toMutableSet()

        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
            println(selectedWord.original)
            val userAnswer = readLine()

            if(userAnswer == selectedWord.translated){
                randomWords.remove(selectedWord)
            } else {
                println(selectedWord.translated)
            }
            println(randomWords.count())

        }
    }
}

