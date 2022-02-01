package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte clientOS = 0;
        byte iOS = 0;
        byte Android = 0;

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
        int year = 4000;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        byte deliveryDistance = 2;
        byte day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = (byte) (day + 1);
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            day = (byte) (day + 2);
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

}

}
