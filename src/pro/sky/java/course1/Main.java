package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {

        //Задание1
        byte x = -128;
        short y = 15000;
        int z = 5555555;
        long k = 1234567890;
        float l = 3.5f;
        double m = 75.3;
        char n = 47;
        boolean o = 100<23;

        //Задание2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float boxerWeight12 = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров составляет " + boxerWeight12 + " кг");
        float weightDifference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров составляет " + weightDifference + " кг");

        //Задание3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakFastWeight = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        System.out.println("Вес спорт-завтрака составляет " + breakFastWeight + " грамм");
        float kgWeight = breakFastWeight / 1000f;
        System.out.println("Вес спорт-завтрака в килограммах " + kgWeight + " кг");

        //Задание4
        int loseWeightKg = 7;
        int loseWeightG = loseWeightKg * 1000;
        int losingWeight1 = 250;
        int losingWeight2 = 500;
        int daysLoseWeight1 = loseWeightG / losingWeight1;
        int daysLoseWeight2 = loseWeightG / losingWeight2;
        System.out.println("Кол-во дней при сбрасывании в день 250 г " + daysLoseWeight1 + " дней" );
        System.out.println("Кол-во дней при сбрасывании в день 500 г " + daysLoseWeight2 + " дней" );
        int middleDays = (daysLoseWeight1 + daysLoseWeight2) / 2;
        System.out.println("В среднем для сброса 7 кг может потребоваться " + middleDays + " дней");

        //Задание5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int months = 12;
        float percent = 10f;
        percent = (10 + 100f) / 100f;
        int mashaSalaryIncrease = (int) (mashaSalary * percent);
        int denisSalaryIncrease = (int) (denisSalary * percent);
        int kristinaSalaryIncrease = (int) (kristinaSalary * percent);
        int mashaSalaryDif = (mashaSalaryIncrease - mashaSalary) * months;
        int denisSalaryDif = (denisSalaryIncrease - denisSalary) * months;
        int kristinaSalaryDif = (kristinaSalaryIncrease - kristinaSalary) * months;
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей." + " Её доход вырос на " + mashaSalaryDif + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей." + " Его доход вырос на " + denisSalaryDif + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей." + " Её доход вырос на " + kristinaSalaryDif + " рублей");

        //Задание6
        task1();

        //Задание7
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        //Задание8
        int num = 256;
        int result = num / 10 % 10;
        System.out.println(result);



    }

    private static void task1() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);
    }
}
