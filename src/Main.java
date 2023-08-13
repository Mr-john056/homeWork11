import java.time.LocalDate;

public class Main {
    public static void checkYear () {
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i == i + 4) {
                System.out.println(i + " год является високосным");
            } else System.out.println(i + " год не является високосным ");
        }
    }


        public static void choiseOs () {
            byte clientOS = 0;
            short clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите стандартную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите стандартную версию приложения для Android по ссылке");
            }
        }
            public static int deliveryCards () {
                int deliveryDistance = 95;
                int days = 1;

                if (deliveryDistance <= 20){
                    System.out.println("Потребуется дней: " + days);
                } else if (deliveryDistance <= 60){
                    System.out.println("потребуется дней: " + (days+1 ));
                    } else if (deliveryDistance <= 100) {
                    System.out.println("Потребуется дней: " + (days+2));
                } else {
                    System.out.println("Нет доставки");
                }
                return days;
            }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача 1");
        checkYear();
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        choiseOs();
        System.out.println();
    }
    private static void task3() {
        System.out.println("Задача 3");
        deliveryCards();
        System.out.println();
    }
}