fun main(){
    val persons = arrayOf( Teacher("Fenna"), Student("Niko"), Comedian("Mike"))

    val chatPartner= persons.random()
    chatPartner.introduction()
    chatPartner.talk()


}



