fun main() {
    greeting()
}

fun greeting() {
    val test = arrayOf("Bent", "Gijs", "Nick", "Sim", "Niko")
    for (element in test) {
        println("Hello $element")
    }
}