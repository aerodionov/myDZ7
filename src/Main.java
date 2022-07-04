import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int year) {
         if (((year% 4 == 0) && (year% 100 !=0)) || (year% 400 == 0)) {
             System.out.println(year + " год является високосным");
        } else {
             System.out.println(year + " год не является високосным");
        }
    }

    private static void checkRequiredOS (int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        if ((clientOS == 1) && (clientDeviceYear < currentYear)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if ((clientOS == 1) && (clientDeviceYear >= currentYear)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((clientOS == 0) && (clientDeviceYear < currentYear)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ((clientOS == 0) && (clientDeviceYear >= currentYear)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    private static int checkPeriodDelivery (int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else {
            deliveryTime = (deliveryDistance - 20) / 40 + 2;
        }
        return deliveryTime;
    }

    public static void main(String[] args) {


        //Задание 1
        int myYear = 2022;
        checkLeapYear(myYear);

        //Задание 2
        System.out.println();
        int clientOS = 0;
        int clientDeviceYear = 2021;
        checkRequiredOS (clientOS, clientDeviceYear);

        //Задание 3
        System.out.println();
        int deliveryDistanceClient = 95;
        System.out.println("Потребуется дней: " + checkPeriodDelivery(deliveryDistanceClient));




    }
}