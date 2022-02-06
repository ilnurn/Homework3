package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte clientOS = 0;
        byte iOS = 0;
        byte Android = 1;

        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    // Задание 2
        short clientDeviceYear = 2013;

        if (clientOS == iOS) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 3
        int year = 800;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 2;
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        }
        // Задание 5
        byte monthNumber = 10;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        // Задание 6
        System.out.println();

        int age = 19;
        int salary = 58_000;
        int limit;

        if (age >= 23) {
            limit = 3 * salary;
        } else {
            limit = 2 * salary;
        }
        if (salary >= 50_000 && salary < 80_000) {
            limit = (int) (1.2 * limit);
        } else if (salary >= 80_000) {
            limit = (int) (5 * limit);
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        //Задание 7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;

        float baseRate = 10;
        int loanTerms;
        float maxMonthlyPayment = 50;

        if (age < 23) {
            baseRate = baseRate + 1;
        } else if (age >= 23 && age < 30) {
            baseRate = (float) (baseRate + 0.5);
        }
        maxMonthlyPayment = (maxMonthlyPayment / 100) * salary;
        float monthlyRatePayment = (wantedSum * (baseRate / 100)) / 12;
        System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyRatePayment + " рублей. ");
        if (maxMonthlyPayment >= monthlyRatePayment) {
            System.out.print("Одобрено");
        } else {
            System.out.print("Отказано");
        }

}

}
