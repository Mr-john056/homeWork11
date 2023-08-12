public class Main {
    public static void checkYear (){
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i == i + 4) {
                System.out.println(i + " год является високосным");
            } else System.out.println(i + " год не является високосным ");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {
        System.out.println("Задача 1");
        checkYear();
    }
    private static void task2() {
        System.out.println("Задача 2");
    }
    private static void task3() {
        System.out.println("Задача 3");
    }

}