package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Общая сумма " + sum);
        System.out.println();

        // Задание 2
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Максимальная сумма " + max);
        System.out.println("Минимальная сумма " + min);
        System.out.println();

        // Задание 3
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


