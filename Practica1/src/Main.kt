fun main() {
    // 1. Объявление константы и переменной
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved++

    // 2. Объявление константы с возрастом
    val myAge = 17
    exercisesSolved++

    // 3. Объявление переменной с возрастом в формате Double
    var averageAge = myAge.toDouble()
    averageAge = (averageAge + 30) / 2

    // 4. Константы testNumber и evenOdd
    val testNumber = 9
    val evenOdd = testNumber % 2

    // Если поменять значение testNumbe, то evenOdd не изменится, т.к. это константа

    exercisesSolved++

    // 5. Работа с переменной answer
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    exercisesSolved++

    // Ну это вывод всего
    println("Количество задач: $exercises")
    println("Решено задач: $exercisesSolved")
    println("Мой возраст (константа): $myAge")
    println("Средний возраст: $averageAge")
    println("Число testNumber: $testNumber")
    println("Остаток от деления testNumber на 2 (evenOdd): $evenOdd")
    println("Конечное значение answer: $answer")

    // 6. Объявление age для компиляции

    fun main() {
        var age = 16
        println(age)
        age = 30
        println(age)
    }

    // 7. Дефолт матеша (Распишу в виде примера)

    val a: Int = 46
    val b: Int = 10

    val answer1: Int = (a * 100) + b = 4610
    val answer2: Int = (a * 100) + (b * 100) = 5600
    val answer3: Int = (a * 100) + (b / 10) = 4601

    // 8. Тоже матеша

    5 * 3 - 4 / 2 * 2

    ((5 * 3) - ((4 / 2) * 2))

    fun main() {

        // 9. Среднее арифметическое двух чисел

        val a: Double = 30.0
        val b: Double = 60.0
        val average: Double = (a + b) / 2
        println("Среднее арифметическое: $average")

        // 10. Конвертация температуры из °F в °C

        val fahrenheit: Double = 68.0
        val celsius: Double = (fahrenheit - 32) / 1.8
        println("Температура в °C: $celsius")

        // 11. Номера строки и столбца на шахматной доске

        val position: Int = 44
        val row: Int = position / 8
        val column: Int = position % 8
        println("Строка: $row, Столбец: $column")

        // 12. Конвертация угла из градусов в радианы

        val degrees: Double = 180.0
        val radians: Double = degrees * Math.PI / 180
        println("Угол в радианах: $radians")

        // 13. Расстояние между двумя точками (x1, y1) и (x2, y2)

        val x1: Double = 3.0
        val y1: Double = 4.0
        val x2: Double = 6.0
        val y2: Double = 8.0
        val distance: Double = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))
        println("Расстояние между точками: $distance")
    }

}

