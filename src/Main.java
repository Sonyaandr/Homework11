public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2021;
        vesokosYear(year);
        System.out.println("Задание 2");
        int clientOS = 0;
        int yearDevice = 2018;
        application(clientOS, yearDevice);
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int dostavka = calcilationDayDelivery(deliveryDistance);
        if (dostavka > 0) {
            System.out.println("Потребуется дней:" + dostavka);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void vesokosYear(int year) {
        if (year % 4 != 0) {
            System.out.println(year + " год - високосным");
        } else if (year % 100 != 0) {
            System.out.println(year + " год - високосный");
        } else if (year % 400 != 0) {
            System.out.println(year + " год - високосным");
        } else {
            System.out.println(year + "год - високосный");
        }

    }

    public static void application(int clientOS, int yearDevice) {
        int currentYear = 2024;
        if (clientOS == 0 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && yearDevice >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && yearDevice >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static int calcilationDayDelivery(int distans) {
        int day = 0;
        if (distans < 21) {
            day = day + 1;
        } else if (distans > 20 && distans < 61) {
            day = day + 2;
        } else if (distans > 60 && distans < 101) {
            day = day + 3;
        } else if (distans > 100) {
            day = 0;
        }
        return day;

    }
}

