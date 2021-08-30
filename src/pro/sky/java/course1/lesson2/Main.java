package pro.sky.java.course1.lesson2;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        }

        //Задание 2
        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 1) {
            if (clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке ");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке ");
            } else {
                System.out.println("Установите обычную версию приложения для IOS по ссылке ");
            }
        }

        //Задание 3
        int year = 2008;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не является високосным");
        } else {
            System.out.println("Год является високосным");
        }

        //Задание 4
        int deliveryDistance = 61;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 1;
        }
        if (deliveryDistance > 60) {
            deliveryTime += 2;
        }
        System.out.println("Срок доставки - " + deliveryTime + " дней");

        //Задание 5
        int monthNumber = 12;
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
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

        //Задание 6
        int age = 19;
        int salary = 58_000;
        double limit = salary;
        if (age < 23) {
            limit *= 2;
        } else {
            limit *= 3;
        }
        if (salary > 80_000) {
            limit *= 1.5;
        } else {
            if (salary > 50_000) {
                limit *= 1.2;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
    }
}
