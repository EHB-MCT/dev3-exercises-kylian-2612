fun main(){
    println("kies een moeilijkheid")
    val difficulty = readLine()
    val duolingo= Duolingo(10, "fr")
    duolingo.play()
}