class Chatbot (val name: String):ChatPartner {
    override fun introduction(){
        println("Hi! I'm $name")
    }
    override fun talk(){
        println("" +
                "I'm the talk function off the robot")
    }
}