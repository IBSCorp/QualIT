# language: ru

  # $число5 999

  # &login параметр передается из другого теста
  # &password параметр передается из другого теста
  # &url параметр передается из другого теста
  # &число параметр передается из другого теста

@Тест2
Функция: Проверка конвертера
    Сценарий: Проверка простой подстановки

        * значение выражения "#{число5}" равно "999"

        * в переменной "тест1" сохранено значение "#{login}"
        * в переменной "тест2" сохранено значение "#{password}"
        * значение выражения "#{тест1}" равно "admin"
        * значение выражения "#{тест1}" начинается с "adm"
        * значение выражения "#{тест2}" равно "12345"
        * значение выражения "#{тест2}" начинается с "123"

        * значение выражения "#{число}" равно "999"
        * в переменной "число2" сохранено значение "444"
        * в переменной "число" сохранено значение "1000"
        * значение выражения "#{число}" не равно "#{число2}"