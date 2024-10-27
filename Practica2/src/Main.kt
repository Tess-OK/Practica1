fun main() {
    // 1. Создание констант age1 и age2
    val age1: Int = 42
    val age2: Int = 21
    println("Тип age1: ${age1::class.simpleName}, Тип age2: ${age2::class.simpleName}")

    // 2. Вычисление среднего арифметического age1 и age2
    val avg1 = (age1 + age2) / 2
    println("avg1: $avg1, Тип: ${avg1::class.simpleName}")

    // 3. Исправление ошибки, преобразование в Double
    val avgCorrected = (age1 + age2) / 2.0
    println("avgCorrected: $avgCorrected, Тип: ${avgCorrected::class.simpleName}")

    // 4. Создание строковых констант firstName и lastName
    val firstName: String = "Дмитрий"
    val lastName: String = "Гущин"

    // 5. Создание полной строки fullName
    val fullName: String = "$firstName $lastName"
    println("Полное имя: $fullName")

    // 6. Создание строки myDetails с использованием строковых шаблонов
    val myDetails: String = "Привет, меня зовут $fullName."
    println(myDetails)

    // 7. Объявление Triple с датой
    val date: Triple<Int, Int, Int> = Triple(10, 15, 2024) // Месяц, день, год

    // 8. Извлечение значений из Triple
    val (month, day, year) = date
    println("Месяц: $month, День: $day, Год: $year")

    // 9. Вывод значений месяца и года
    val monthValue: Int = month
    val yearValue: Int = year
    println("Месяц: $monthValue, Год: $yearValue")

    // 10. Изменение значения месяца и создание новой Pair
    val newMonth = month + 1
    val newDate: Pair<Int, Int> = Pair(newMonth, year)
    println("Новая пара (Месяц, Год): ${newDate.first}, ${newDate.second}")
}
