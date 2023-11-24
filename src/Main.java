

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
    public static void test1() {
        System.out.println("        Задача №1");
        String firstName = "Ivan",
               middleName = "Ivanovich",
               lastname = "Ivanov";
        String fullName = String.join(" ", lastname, firstName, middleName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
    public static void test2() {
        System.out.println("        Задача №2");
        String firstName = "ivan",
               middleName = "ivanovich",
               lastname = "ivanov";
        String fullname = String.join(" ", lastname, firstName, middleName);
        System.out.println(fullname);
        fullname = fullname.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullname);
    }
    public static void test3() {
        System.out.println("        Задача №3");
        String fullName = "Сёмёнов Сёмён Сёмёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}


