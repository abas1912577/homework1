package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();


    }

    private static void task4() {
        int min = 1;
        int max = 30;
        for (; min <= max; min++) {
            System.out.print(min + ": ");
            if (min % 3 == 0) {
                System.out.print("ping" + " ");
            }
            if (min % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();

        }

    }

    private static void task3() {
        int currentYear = 2021;
        int minYear = currentYear - 200;
        int maxYear = currentYear + 79;
        for (int year = minYear; year <= maxYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }


    private static void task2() {
        int daysMonth = 31;
        int daysWeek = 7;
        int firstFriday = 1;
        int friday = firstFriday;
        System.out.println();
        for (; friday <= daysMonth; friday = friday + daysWeek) {
            System.out.println("Сегодня пятница " + friday + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task1() {
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
    }
}




