class Train(var direction: Direction) {
    val carriages: MutableList<Carriage> = mutableListOf()

    fun send() {
        println("Поезд поехал")
    }
}