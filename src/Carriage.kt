class Carriage private constructor(val capacity: Int, val passengersCount: Int) {

    companion object {
        fun create(capacity: Int, passengersCount: Int): Carriage? {
            if (capacity !in 5..25) {
                println("Неверное значение. Вместимость должна быть между 5 и 25 включительно.")
                return null
            }

            if (passengersCount > capacity) {
                println("Неверное значение. Количество пассажиров не может превышать вместимость вагона.")
                return null
            }

            return Carriage(capacity, passengersCount)
        }
    }
}