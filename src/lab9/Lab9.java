/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author korjk
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Привіт! Початок виконання програми...");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            MainMenu();
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Помилка введення. Будь ласка, введіть ціле число.");
                scanner.nextLine();
            }
            switch (choice) {
                case 1: {
                    System.out.println("Введіть n:");
                    int n = 0;
                    try {
                        n = scanner.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Помилка введення. Будь ласка, введіть ціле число.");
                        scanner.nextLine();
                        break;
                    }
                    int[] RandomNumbers = new int[n];
                    Random rndm = new Random();
                    for (int i = 0; i < n; i++) {
                        RandomNumbers[i] = rndm.nextInt();
                    }
                    ArrayMethods(RandomNumbers);
                }
                break;
                case 2: {
                    System.out.println("Введіть n:");
                    int n = 0;
                    try {
                        n = scanner.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Помилка введення. Будь ласка, введіть ціле число.");
                        scanner.nextLine();
                        break;
                    }
                    int[] Numbers = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Введіть "+(i+1)+" число:");
                        try {
                            Numbers[i] = scanner.nextInt();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Помилка введення. Будь ласка, введіть ціле число.");
                            scanner.nextLine();
                            i--;
                        }
                    }
                    ArrayMethods(Numbers);
                }
                break;
                case 3: {
                    System.out.println("Дякуємо за використання програми. До побачення!");
                    System.exit(0);
                    break;
                }
                default:
                    break;
            }
        }
    }

    public static void MainMenu() {
        System.out.println("Оберіть опцію:");
        System.out.println("1. Випадкова генерація n-ої к-сті чисел");
        System.out.println("2. Самостійний ввід");
        System.out.println("3. Вийти");
    }

    public static void ArrayMethods(int[] array) {
        int[] SortedAscendingArr = Arrays.copyOf(array, array.length);
        int[] SortedDescendingArr = Arrays.copyOf(array, array.length);
        Arrays.sort(SortedAscendingArr);
        Arrays.sort(SortedDescendingArr);
        Reverse(SortedDescendingArr);
        int FindMax = SortedAscendingArr[SortedAscendingArr.length - 1];
        int FindMin = SortedAscendingArr[0];
        System.out.println("Початковий масив: " + Arrays.toString(array));
        System.out.println("Відсортований за зростанням масив: " + Arrays.toString(SortedAscendingArr));
        System.out.println("Відсортований за спаданням масив: " + Arrays.toString(SortedDescendingArr));
        System.out.println("Найбільший елемент: " + FindMax);
        System.out.println("Найменший елемент: " + FindMin);
    }

    public static void Reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
