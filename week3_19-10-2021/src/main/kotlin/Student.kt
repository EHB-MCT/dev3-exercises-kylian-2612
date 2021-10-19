class Student (override val name: String):Person(name), ChatPartner {
    override fun talk(){
        gossip()
    }
    fun gossip(){
        println("Design3 is the most annoying course in MCT 2")
    }
}