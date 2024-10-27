fun main() {
    // 1. Создание константы myAge и isTeenager
    val myAge = 17
    val isTeenager = myAge in 13..19

    // 2. Создание константы theirAge и bothTeenagers
    val theirAge = 30
    val bothTeenagers = isTeenager && (theirAge in 13..19)

    // 3. Создание константы reader, author и authorIsReader
    val reader = "Дмитрий"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    // 4. Создание константы readerBeforeAuthor
    val readerBeforeAuthor = reader < author

    // 5. Проверка возраста с помощью if
    val myAge2 = myAge
    if (myAge2 in 13..19) {
        println("Подросток")
    } else {
        println("Не подросток")
    }

    // 6. Использование однострочного if-else
    val answer = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

    // 7. Цикл while
    var counter = 0
    while (counter < 10) {
        println("counter равен $counter")
        counter++
    }

    // 8. Цикл do-while
    counter = 0
    var roll: Int
    do {
        roll = (0..5).random()
        counter++
    } while (roll != 0)
    println("После $counter бросков, roll равен $roll")

    // 9. Цикл for для вывода квадратов чисел от 1 до 10
    val range = 1..10
    for (i in range) {
        println("Квадрат числа $i равен ${i * i}")
    }

    // 10. Цикл for для вывода квадратного корня из чисел от 1 до 10
    for (i in range) {
        println("Квадратный корень числа $i равен ${Math.sqrt(i.toDouble())}")
    }

    // 11. Шаг step с первым циклом for
    fun main() {
    var sum = 0
    for (row in 0 until 8 step 2) { // Используем шаг 2, чтобы перебрать только четные строки
        for (column in 0 until 8) {
            sum += row + column
        }
    }
    println("Сумма равна $sum") // Проверим, что сумма равна 448
    }
}
