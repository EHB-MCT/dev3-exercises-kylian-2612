fun main() {
    val test = arrayOf("Bent", "Gijs", "Nick", "Sim", "Niko")
    for (friend in test) {
        greeting(friend)
    }
}

fun greeting(friend:String) {
    println("Hello $friend")
    }