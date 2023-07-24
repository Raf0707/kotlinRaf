//Основы kotlin
fun main() {
    // переменные
    val a = 1 // неизменяемая переменная
    var b = 2 // изменяемая переменная

    // Основные типы данных
    val int: Int // переменная типа Int
    val long: Long // переменная типа Long
    val uInt: UInt // беззнаковый Int
    val uLong: ULong // беззнаковый Long
    // byte, short - аналогично

    val double: Double // без UDouble
    val float: Float // без UFloat

    val bool: Boolean = true // явное указание типа
    val boolean = false // автоопределение типа

    val char = 'c'

    //Строки
    val str = "qwerty"
    val str1 = str + 20 // автоперевод int 20 в String "20"
    // но 20 + str уже не работает, это по-другому
    val str2 = "$a ${a + 10 - 12 + 20} $b ${b + 23467}  $str" // $ - для включения знач переменной в строку
    // ${...} - в {} пишется действие с переменной
    val text = """
        |это большая строка
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    
    Методы форматирования больших строк
    
    |trimMargin() 
        Удаляет начальные пробельные символы, за которыми следует marginPrefix, 
        из каждой строки исходной строки и удаляет первую и последнюю строки, 
        если они пустые (обратите внимание на разницу между blank и empty).
        
    |trimIndent()
        Определяет общий минимальный отступ для всех строк ввода, 
        удаляет его из каждой строки, а также удаляет первую и последнюю строки, 
        если они пустые (обратите внимание на разницу между пустыми и незаполненными).
        
    |trimStart()
        Возвращает подпоследовательность этой последовательности символов, 
        содержащую начальные символы, соответствующие удаленному предикату
        
    |trimEnd()
        Возвращает подпоследовательность этой последовательности символов, 
        содержащую завершающие символы, соответствующие удаленному предикату
        
    |trim() - обрезка пробелов вокруг строки (вначале и вконце)
    
    
    """.trimMargin()

    // как поставить знак доллара в неэкранируемых строках
    val price = """
        ${'$'}_9.99
    """

    //условные конструкции

    //1. if-else
    if (a < b) println(true)
    else println(false)

    //2. when (в java - switch-case)
    when (a) {
        1 -> println(1) // если а=1, то выводим 1
        2 -> println(2) // если а=2, то выводим 2
        in 3..10 -> println("""
            выражение in 3..10 - диапазон
            a = $a находится в диапазоне 3..10 (от 3 до 10)"
            """.trimMargin())
        in 11..20 -> println("""
            выражение in 11..20 - диапазон
            a = $a находится в диапазоне 11..20 (от 11 до 20)"
            """.trimMargin())

    }

    // диапазоны
    val range =  "a".."d" //abcd
    val range1 =  1..5      // 1 2 3 4 5
    val range2 =  5 downTo 1    // 5 4 3 2 1 ; downTo - в обратном порядке
    val range3 = 1..10 step 2           // 1 3 5 7 9 ; step - шаг
    val range4 = 10 downTo 1 step 3     // 10 7 4 1
    val range5 = 1 until 9          // 1 2 3 4 5 6 7 8
    // until позволяет не включать верхнюю границу в диапазон
    val range6 = 1 until 9 step 2   // 1 3 5 7

    /*
    in: возвращает true, если объект имеется в диапазоне
    !in: возвращает true, если объект отсутствует в диапазоне
     */

    // циклы
    for (i in 1..10) println(i) // цикл for

    var iter = 10; // итератор для цикла
    while (iter > 0) println(iter--) // цикл while

    // на заметку
    // перебор диапазона с помощью циклов

    val rng1 = 5 downTo 1
    for(c in rng1) print(c)   // 54321
    println()

    val rng2 = 'a'..'d'
    for(c in rng2) print(c)   // abcd
    println()

    for(c in 1..9) print(c)     // 123456789
    println()

    for(c in 1 until 9) print(c)    // 12345678
    println()

    for(c in 1..9 step 2) print(c)  // 13579

    // массивы (списки)
    var list = listOf(1, 2, 3, 4, 5)
    for (i in 0..list.size-1) println(list[i])

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    // С помощью встроенной функции arrayOf() можно передать набор значений,
    // которые будут составлять массив

    // массивы для базовых типов
    val nums: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)

    //Двухмерные массивы
    val table: Array<Array<Int>> = Array(3, { Array(5, {0}) }) // табличка 3Х5

    val tbl = Array(3, { Array(3, {0}) })
    tbl[0] = arrayOf(1, 2, 3)     // первая строка таблицы
    tbl[1] = arrayOf(4, 5, 6)     // вторая строка таблицы
    tbl[2] = arrayOf(7, 8, 9)     // третья строка таблицы

    // перебор двумерных массивов через цикл
    for(row in tbl){

        for(cell in row){
            print("$cell \t")
        }
        println()
    }

}

