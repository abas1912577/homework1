package pro.sky.java.course1.lesson6;

public class Main {
    public static void main(String[] args) {
        //Задание1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);

        //Задание3
        String fullNameSemicolon = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameSemicolon);

        task4();
        task5();

    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        int a = fullName.indexOf(' ') + 1;
        int b = fullName.lastIndexOf(' ') + 1;
        int c = fullName.length();
        String firstName = fullName.substring(a, b);
        String middleName = fullName.substring(b, c);
        String lastName = fullName.substring(0, a);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

    }

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName1);

    }
}
