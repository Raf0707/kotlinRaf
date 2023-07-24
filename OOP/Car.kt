open class Car(_title: String, _maxSpeed: Int, _seets: Int, _color: String) { // Car(...) - начальный конструктор

    open var title = _title // создание поля с мгновенной начальной инициализацией
        get() = field // геттер
        set(title) { field = title } // сеттер

    open var maxSpeed = _maxSpeed
        get() = field
        set(maxSpeed) { field = maxSpeed }

    open var seets = _seets
        get() = field
        set(seets) {field = seets}

    open var color = _color
        get() = field
        set(color) {field = color}

    override fun toString(): String { // метод toString, который представляет объект в строковом виде, другими словами - описывает объект
        val s = """
            title = $title
            maxSpeed = $maxSpeed
            seets = $seets
            color = $color
        """.trimIndent()

        return s
    }

}
