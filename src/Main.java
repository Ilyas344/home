import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        int clientOS = sc.nextInt();
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int year = sc.nextInt();
        if (year > 2005) {
            if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
            else if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        System.out.println("Задание 3");
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) System.out.println("високосный");
        else System.out.println("невисокосный");
        System.out.println("Задание 4");

        int deliveryDistance = 55;
        int day = 0;
        if (deliveryDistance < 20) day = +1;
        else if (deliveryDistance > 20 && deliveryDistance < 60) day = +2;
        else if (deliveryDistance > 60 && deliveryDistance < 100) {
            day = +3;
        }
        System.out.println("Потребуется дней: " + day + " срок доставки");
        System.out.println("Задание 5");
        int monthNumber = 12;
                switch (monthNumber){
                    case 1:System.out.println("январь");break;
                    case 2:System.out.println("февраль");break;
                    case 3:System.out.println("март");break;
                    case 4:System.out.println("апрель");break;
                    case 5:System.out.println("май");break;
                    case 6:System.out.println("июнь");break;
                    case 7:System.out.println("июль");break;
                    case 8:System.out.println("август");break;
                    case 9:System.out.println("сентябрь");break;
                    case 10:System.out.println("октябрь");break;
                    case 11:System.out.println("ноябрь");break;
                    case 12:System.out.println("декабрь");break;
                    default: break;
                }
    }
}