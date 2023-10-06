package laba2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = GetNumber();
        Phone phones[] = new Phone[n];
        GetData(n, phones);
        CheckingInTalks(n, phones);
        CheckingOuTalks(n, phones);
        CheackingRange(n,phones);

    }

    public static int GetNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість користувачів: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Споживаємо символ нового рядка
        return n;
    }

    public static void GetData(int n, Phone[] phones) {
        Scanner scanner = new Scanner(System.in);

        int Id;
        String name;
        String lastName;
        String middleName;
        int acNumber;
        int inTalks;
        int ouTalks;

        for (int i = 0; i < n; i++) {
            System.out.println("\nВведіть дані про " + (i + 1) + "-го абонента: ");
            System.out.print("Введіть Id: ");
            Id = scanner.nextInt();
            scanner.nextLine(); // Споживаємо символ нового рядка
            System.out.print("Введіть ім'я абонента: ");
            name = scanner.nextLine();
            System.out.print("Введіть прізвище абонента: ");
            lastName = scanner.nextLine();
            System.out.print("Введіть по батькові абонента: ");
            middleName = scanner.nextLine();
            System.out.print("Введіть номер рахунку: ");
            acNumber = scanner.nextInt();
            System.out.print("Введіть час розмов в інших містах: ");
            ouTalks = scanner.nextInt();
            System.out.print("Введіть час розмов в одному місті: ");
            inTalks = scanner.nextInt();

            phones[i] = new Phone(Id, name, lastName, middleName, acNumber, inTalks, ouTalks);
        }

    }

    public static void CheckingInTalks(int n, Phone[] phones) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть час міських розмов для порівняння: ");
        int k;
        k = scanner.nextInt();
        scanner.nextLine(); // Споживаємо символ нового рядка

        System.out.println("Відомості про абонентів, в яких час міських розмов перевищує заданий:  ");
        for (int i = 0; i < n; i++) {
            if (phones[i].getInTalks() > k) {
                System.out.println("\nId: " + phones[i].getId());
                System.out.println("Прізвище: " + phones[i].getLastName());
                System.out.println("Час міських розмов: " + phones[i].getInTalks());
            }
        }

    }

    public static void CheckingOuTalks(int n, Phone[] phones) {

        System.out.println("Відомості про абонентів, які користувались міжміським зв'язком: ");
        for (int i = 0; i < n; i++) {
            if (phones[i].getOutTalks() != 0) {
                System.out.println("\nId: " + phones[i].getId());
                System.out.println("Прізвище: " + phones[i].getLastName());
                System.out.println("Час міжміських розмов: " + phones[i].getOutTalks());
            }
        }

    }

    public static void CheackingRange(int n,Phone[] phones){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть діапазон для перевірки номера рахунку: ");
        System.out.println("min: ");
        int min=scanner.nextInt();
        System.out.println("max: ");
        int max=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (phones[i].getAcNumber()>min && phones[i].getAcNumber()<max) {
                System.out.println("\nId: " + phones[i].getAcNumber());
                System.out.println("Прізвище: " + phones[i].getLastName());
                System.out.println("Час міжміських розмов: " + phones[i].getOutTalks());
            }
        }

        scanner.close();
    }



}
