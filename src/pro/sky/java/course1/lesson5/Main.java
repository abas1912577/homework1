package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //Задание 1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма затрат за месяц составил " + sum + " рублей.");

        //Задание 2
        int maxCost = 0;
        int minCost = 200000;
        for (int a = 0; a != arr.length; a++) {
            if (arr[a] > maxCost) {
                maxCost = arr[a];
            }
            if (arr[a] < minCost) {
                minCost = arr[a];
            }
        }
        System.out.println("Максимальная сумма затрат за месяц составила " + maxCost + " рублей. Минимальная сумма затрат за месяц составила " + minCost + " рублей.");

        //Задание 3
        double midCost = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + midCost + " рублей.");

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char b = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = b;
            System.out.println(b);
        }

        //Задание 5
        int[][] gameField = new int[3][3];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = 0;
                if (gameField[i] == gameField[j]) {
                    gameField[i][j] = 1;
                } else {
                    gameField[i][j] = 0;
                }
            }
        }
        for (int[] row : gameField) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}

