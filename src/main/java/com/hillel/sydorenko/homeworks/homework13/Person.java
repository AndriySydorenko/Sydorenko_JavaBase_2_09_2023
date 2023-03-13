package com.hillel.sydorenko.homeworks.homework13;

public class Person {
    //    Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис, приймаючи наступні параметри:
//    Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//    Ім'я
//    Дата народження (окремо день, місяць, рік)
//    Емейл
//            Телефон
//    Змінювані:
//    Прізвище
//            Вага
//    Тиск
//    Кількість пройдених за день кроків
//    Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//    Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//    Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з іншими полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
//    У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo(); для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
    private final String name;
    private final String email;
    private final int yearOfBirth;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int phone;

    private String lastName;
    private int weight;
    private int pressure;
    private int countOfSteps;
    int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    // Сетери для змінних, що можна змінювати
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int bloodPressure) {
        this.pressure = bloodPressure;
    }

    public void setCountOfSteps(int stepsPerDay) {
        this.countOfSteps = stepsPerDay;
    }

    public Person(String name, String email, int yearOfBirth, int dayOfBirth, int monthOfBirth, int phone, String lastName, int weight, int pressure, int countOfSteps) {
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.countOfSteps = countOfSteps;
        this.age = calculateAge();
    }

    private int calculateAge() {
        int currentYear = 2023;
        int age = currentYear - getYearOfBirth();
        return age;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println(name + " " + lastName + " - " + "age: " + age + " " + "birthday: " + monthOfBirth + "." + dayOfBirth + "." + yearOfBirth + " " + "email: " + email + " " + "phone: " + phone + ". " + "Parameters - " + "weight: " + weight + " " + " pressure: " + pressure + " " + "steps: " + countOfSteps);
    }

}
