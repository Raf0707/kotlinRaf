package kotlinRaf.OOP

interface Movable {
    var speed: Int
    fun move()
    fun stop() {
        println("stop")
    }

    class BankAccaunt(userName: String, password: Int) {

        open inner class User(_name: String, _pass: Int, _totalMoney: Int) {

            open var name = _name
                get() = field
                set(name) {field = name}

            open var pass = _pass
                get() = field
                set(pass) {field = pass}

            open var totalMoney = _totalMoney
                get() = field
                set(money) {field = money}

            fun transaction(sum: Int) {
                this@User.totalMoney -= sum
            }
        }

        fun transaction(userFrom: User, userTo: User, summ: Int) {
            userFrom.totalMoney -= summ
            userTo.totalMoney += summ
        }

        sealed interface Error
        sealed class IOError() : Error




    }
}

