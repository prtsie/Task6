class Direction(var from: String, var to: String) {
    companion object {
        private val values = arrayOf(
            "Санкт-Петербург",
            "Москва",
            "Новосибирск",
            "Уфа",
            "Омск",
            "Тула",
            "Калуга",
            "Владимир",
            "Нижний Новгород",
            "Екатеринбург",
            "Казань",
            "Челябинск",
            "Самара",
            "Воронеж",
            "Барнаул",
            "Ижевск",
            "Махачкала"
        )

        fun generate(): Direction {
            val from = values.random()
            var to = values.random()
            while (to == from) {
                to = values.random()
            }
            return Direction(from, to)
        }
    }
}