//Функциональное программирование

/*
функция:

fun имя_функции (параметры) : возвращаемый_тип{
    выполняемые инструкции
}
*/

// Простой пример функции
fun simpleFunctionExample() {

    fun hello() {
        print("Hello")
    }

    fun main() {
        hello()
    }

}



// передача параметров
fun functionWithParametrsExample() {

    fun showMessage(_message: String) {
        println(_message)
    }

    fun displayUserInfo(_name: String, _age: Int) {
        print("name: $_name; \n age: $_age")
    }

    fun main() {
        showMessage("Hello, Kotlin")
        displayUserInfo("Raf", 19)
    }

}

// аргументы по умолчанию
fun defaultArguments() {
    fun userInfo(_name: String = "noname", _age: Int = 18) {
        print("name: $_name; \n age: $_age")
    }

    fun main() {
        userInfo("Ibragim", 20) // Ibragim, 20
        userInfo("Bob") // Bob, 18
        userInfo(_age = 40) // noname, 40
        userInfo() // noname, 18
    }
}

fun editParams() {

    // единичные параметры не изменяемы
    // если массив или коллекция, то часть изменить можно

    fun sqwr(nums: IntArray) {
        nums[0] = nums[0] * 2
    }
}

fun varargs() {

    // Неограниченное количество аргументов

    fun printStrs(vararg str: String) {
        for (s in str) {
            println(s)
        }
    }

    // в случае нескольких параметров, vararg передается последним
    fun printUserGroup(count: Int, vararg users: String) {
        println("Count: $count")
        for(user in users)
            println(user)
    }

    fun printUserGroup(group: String, vararg users: String, info: String, count: Int){
        println("Group: $group")
        println("Count: $count")
        for(user in users)
            println(user)
        println("info: $info")
    }

    fun main() {

        printUserGroup("JVMFrog", "iBa", "intbyte", "kirbo", "virus", "berlash", info = "info", count = 5)

        printStrs("Raf", "Sam", "Sof", "Tim", "iBa", "Leha", "Architector")
        printStrs("java", "kotlin", "C++")
        printStrs("One string")
    }
}

fun operatorSpread() {
    // var list = listOf(1, 2, 3, 4, 5)
    //
    fun changeNumbers(vararg numbers: Int, koef: Int) {
        for(number in numbers) println(number * koef)
    }
    fun main() {

        val nums = intArrayOf(1, 2, 3, 4)
        changeNumbers(*nums, koef=2)

        changeNumbers(1, 2, 3, 4, koef=2)
    }
}

fun returnFun() {

    // void in java = Unit in kotlin
    fun unit() : Unit {}
    fun unit1() {}


    fun calculate() {

        fun sum(x: Int, y: Int) : Int {
            return x + y
        }

        fun dif(x: Int, y: Int) : Int {
            return x - y
        }

        fun mult(x: Int, y: Int) : Int {
            return x * y
        }

    }

    fun checkAge(age: Int) : Unit {
        if (age < 0 || age > 160) {
            println("Invalid age")
            return
        }
        println("Age is valid")
    }

    fun ageIsValid(age: Int) = age > 0 && age < 111
}

fun oneLine() {

    // fun имя_функции (параметры_функции) = тело_функции

    fun squareOneLine(x: Int) = x * x
    fun sum(x: Int, y: Int) = x + y
    fun dif(x: Int, y: Int) = Math.abs(x - y)
    fun mult(x: Int, y: Int) = x * y
}

fun overloadFuncs() {

    fun calculate() {

        fun sum() = print("Summ function")
        fun sum(x: Int) = x + x
        fun sum(x: Int, y: Int) = x + y
        fun sum(x: Int, y: Int, z: Int) = x + y + z
        fun sum(a: Int, b: Int, c: Int, d: Int) = a + b + c + d

        fun dif(x: Int, y: Int) = Math.abs(x - y)
        fun mult(x: Int, y: Int) = x * y

    }
}

fun typeFunc() {

    val message: () -> Unit
    val sum: (Int, Int) -> Int
}

fun varFuncs() {

    fun hello(){
        println("Hello Kotlin")
    }
    fun sum(a: Int, b: Int): Int{
        return a + b
    }

    fun main() {

        val message: () -> Unit
        message = ::hello
        message()

        val mas = ::hello
        mas()

        val operation: (Int, Int) -> Int = ::sum
        val result = operation(3, 5)
        println(result) // 8

        val oper = ::sum
        oper(3, 5)

        val op = sum(3, 5)
        print(op)

        print(sum(3, 5))
    }

}




