fun main(){
    val persons = arrayOf( Teacher("Fenna"), Student("Niko"), Comedian("Mike"), Chatbot("Clippy"))

    val chatPartner= persons.random()
    chatPartner.introduction()
    chatPartner.talk()


}



