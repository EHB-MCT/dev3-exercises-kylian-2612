class Comedian(override val name: String):Person(name) {
    override fun talk(){
        tellJoke()
    }
    fun tellJoke(){
        println("Heared about the new restaurant called Karma?")
        println("there's no menu: you get what you deserve")
    }
}