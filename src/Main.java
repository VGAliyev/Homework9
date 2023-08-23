import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 9\n");

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min
                + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        double avg = 0.0;
        for (int j : arr) {
            avg += (double) j / arr.length;
        }
        String formatedAvg = String.format("%.2f", avg);
        System.out.println("Средняя сумма трат за месяц составила " + formatedAvg + " рублей.");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}