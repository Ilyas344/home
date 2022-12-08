public class Сycle1 {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1\n");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d ", i);
        System.out.println("\n\nЗадача 2\n");
        for (int i = 10; i > 0; i--)
            System.out.printf("%d ", i);
        System.out.println("\n\nЗадача 3\n");
        for (int i = 0; i < 17; i += 2)
            System.out.printf("%d ", i);
        System.out.println("\n\nЗадача 4\n");
        for (int i = 10; i >= -10; i--)
            System.out.printf("%d ", i);
        System.out.println("\n\nЗадача 5\n");
        for (int i = 1904; i < 2096; i = i + 4)
            System.out.println("Високосный год " + i);
        System.out.println("\n\nЗадача 6\n");
        for (int i = 7; i <= 98; i += 7)
            System.out.printf("%d ", i);
        System.out.println("\n\nЗадача 7\n");
        for (int i = 0; i <= 9; i++)
            System.out.print((int) Math.pow(2, i) + " ");
            System.out.println("\n\nЗадача 8\n");
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("\n\nЗадача 9\n");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого: " + total + " рублей");
        System.out.println("\nЗадача 10\n");
        total = 0;
        for (int i = 0; i <= 10; i++) {
            total = i * 2;
            System.out.println("2*" + i + "=" + (total));
        }
    }


}

