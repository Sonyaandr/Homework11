public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2021;
        isLeapYear(year);
        System.out.println("Задание 2");
        int clientOS = 0;
        int yearDevice = 2018;
        application(clientOS, yearDevice);
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDayDelivery(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void isLeapYear(int year) {
        if ((year % 4 != 0) && (year > 1584)) {
            System.out.println(year + " год не является високосным");
        } else if (year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + "год является високосным");
        }
    }

    public static void application(int clientOS, int yearDevice) {
        int currentYear = 2015;
        if (clientOS == 0 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int calculateDayDelivery(int distans) {
        int day = 0;
        if (distans <= 20) {
            day = day + 1;
        } else if (distans > 20 && distans <= 60) {
            day = day + 2;
        } else if (distans > 60 && distans <= 100) {
            day = day + 3;
        }
        return day;

    }
}

