package kotlinRaf.base_syntax

import kotlin.random.Random

/**
 * Основы Котлин
 */

fun main() { // главная функция

    /**
     * [kotlin] fun main()
     *        ==
     * [java] public static void main(String[] args)
     */

    /**
     * [kotlinPrimaryType]
     * переменные и примитивы
     */

    // [var/val] title_value: DataType = value
    // [var/val] title_value = value
    val a: Int = 5
    var b = 7

    /**
     * [java]
     * [javaPrimitiveType]
     * int a = 1;
     * int b = 2;
     */

    //__________________________________________

    /**
     * [kotlinPrimaryType]
     * переменные и примитивы
     */

    val byte: Byte = 123 // -128 до 127
    val uByte: UByte = 255u // 0 до 255
    var byte1: Byte = 122
    var uByte2: UByte

    /**
     * [java]
     * [javaPrimitiveType]
     * byte b = 123;
     * byte b1 = 122;
     * Примечание: в [java] нет беззнакового типа (uInt, uByte, uShort...)
     */


    /**
     * [kotlinPrimaryType]
     * переменные и примитивы
     * Основные типы данных
     */

    val int: Int // переменная типа Int
    val long: Long // переменная типа Long
    val uInt: UInt // беззнаковый Int
    val uLong: ULong // беззнаковый Long
    val short: Short // переменная типа short
    val uShort: UShort // переменная типа UShort

    /**
     * [java]
     * [javaPrimitiveType]
     * int a;
     * long l;
     * byte b;
     * short sh;
     */

    val double: Double // без UDouble
    val float: Float // без UFloat

    /**
     * [java]
     * [javaPrimitiveType]
     * double d;
     * float f;
     */

    val bool: Boolean = true // явное указание типа
    val boolean = false // автоопределение типа

    val char = 'c'

    //Строки
    var str = "qwerty"
    val str1 = str + 20 // автоперевод int 20 в String "20"
    // но 20 + str уже не работает, это по-другому
    val str2 = "qwretyqwreqwyet $a qwteuqwyet ${a + 10 - 12 + 20} hejfd $b ${b + 23467}  $str" // $ - для включения знач переменной в строку
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
    val dollar = "\$"

    /**
     * [java]
     * [javaString]
     * String s = "qwe" + "rty" + a + "asd" + b + "fgh"
     * !!! В котлине работа со строками гораздо легче, чем в java
     */


    //условные конструкции

    //1. if-else

    /**
     * если после условия идет одно действие,
     * то расстановка фигурных скобок необязательна
     */

    if (a < b) println(true)
    else if (a == b) println("==")
    else println(false)

    // в java код тот же самый

    /**
     * если же после условия идут несколько действий,
     * то их необходимо заключить в блок выполнения - фигкрные скобки
     */

    val res: Boolean
    val message: String

    if (a < b) {
        message = "a < b"
        res = true
        println("$res, $message")
    } else if (a == b) {
        println("a == b")
        message = "it's not true and not false"
        println(message)
    } else {
        res = false
        message = "a > b"
        println("$res, $message")
    }

    // тернарный оператор
    val condition = 1 < 2
    val ifTrue = true
    val ifFalse = false

    if (condition) ifTrue else ifFalse


    //2. when (в java - switch-case)
    val nm = 25
    when(nm) {
        1 -> println(1)
        2 -> println(2)
        3 -> println(3)
        in 4..10 -> (4..10).forEach { print("$it ") }
        in 11..20 -> (11..20).forEach { print("$it ") } // так быстрее работает
        in 21..30 -> {
            for (i in 21..30) {
                print("$i ")
            } // так дольше работает и выглядит тупо
        }
    }

    /**
     * [javaSwitchCase] == [kotlinWhen]
     * int nm = 25;
     * switch(nm) {
     *      case 1:
     *          println(1);
     *      case 2:
     *          ...
     *      case 3:
     *          ...
     */

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

    /**
     * Коллекции
     * [kotlinCollectionPrime]
     */


    /**
     * [kotlinMassive]
     */


    // массивы (списки)
    val l = listOf(1.0, 2, 3, 4, 5) // неизменяемый список
    for (i in 0..l.size - 1) println(l[i])
    for (i in 0 until l.size) println(l[i])

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    // С помощью встроенной функции arrayOf() можно передать набор значений,
    // которые будут составлять массив

    // массивы для базовых типов
    val nums: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)
    val bytes: ByteArray = byteArrayOf(1, 2, 3, 4, 5)
    val bools: BooleanArray = booleanArrayOf(false, true)

    //Двухмерные массивы
    val table: Array<Array<Int>> = Array(3, { Array(5, {0}) }) // табличка 3Х5

    fun mainTable() {
        val table: Array<Array<Int>> = Array(3, { Array(5, {0}) }) // табличка 3Х5
        for (i in 0..2) {
            for (j in 0..4) {
                print(table[i][j])
            }
            println()
        }

    }

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

    var tnzr3 = Array(3, {Array(3, {Array(3, { Random(123) })})})
    for (i in tnzr3)
        for (j in i)
            for (k in j)
                print("$k \t")


    // изменяемые списки: mutable

    /**
     * [kotlinMutableMassive]
     */

    val mas = mutableListOf(1, 2, 3, 4, 5)
    (6..10).forEach{mas.add(it)}
    (11..15).iterator().forEach{mas.add(it)}
    (16..20).iterator().forEach{mas.add(it)}
    (7..18).iterator().forEach{mas.remove(it)}

    println(mas)

    // Set

    /**
     * [kotlinSet]
     */

    // set
    val fruitReadOnly = setOf("apple", "banana", "cherry", "cherry")
    println(fruitReadOnly)

    //mutable Set
    val fruit = mutableSetOf("apple", "banana", "cherry")
    fruit.add("melon")
    fruit.add("dragonfruit")
    println(fruit)

    /**
     * [kotlinMap]
     */

    // Map
    val readOnlyJuiceMenu: Map<String, Int> = mapOf(
        "mango" to 100,
        "kivi" to 50,
        "melon" to 10,
        "water" to 20,
        "lemon" to 60
    )

    println(readOnlyJuiceMenu["mango"])

    // mutableMap
    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "mango" to 100,
        "kivi" to 50,
        "melon" to 10,
        "water" to 20,
        "lemon" to 60
    )

    juiceMenu.put("apple", 90)
    juiceMenu.put("orange", 70)

    println(juiceMenu.count())

    /**
     * [kotlinCollections]
     * [funcs]
     * 1. Addition
     * for list and set:
     * [add] - addition element in oreder
     * myMass.add(7)
     * myMass.add(8..19)
     * for map: [put] (mySet.put("key", value))
     *
     * 2. Remove (for list, set and map):
     * myList.remove(listElement)
     * mySet.remove(setElement)
     * myMap.remove("mapKey")
     *
     * 3. Count
     * [count] - function count()
     * for list, set and map
     * println(myList.count())
     * println(mySet.count())
     * println(myMap.count())
     *
     * this function return size of collection
     */
}


