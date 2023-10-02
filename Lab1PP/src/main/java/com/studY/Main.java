package com.studY;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int n = GetIndex(); // Отримати індекс числа Фібоначчі від користувача
        int number = FibonacciNumber(n); // Обчислити n-число Фібоначчі
        System.out.println(n + "-число Фібоначчі: " + number);
        int num = FibonacciNumber(n + 2); // Обчислити (n+2)-число Фібоначчі
        boolean opt = Checking(n); // Перевірити умову F(n+2) < 2^n
        System.out.println("F(n+2) < 2^n");
        if(opt == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static int GetIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть індекс числа Фібоначчі (максимум 30): ");
        int n = scanner.nextInt(); // Зчитати індекс з консолі
        scanner.close();
        return n; // Повернути індекс числа Фібоначчі
    }

    public static int FibonacciNumber(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev = 0;
            int current = 1;
            int next;
            for(int i = 2; i <= n; i++){
                next = prev + current;
                prev = current;
                current = next;
            }
            return current; // Повернути n-те число Фібоначчі
        }
    }

    public static boolean Checking(int n){
        int a = FibonacciNumber(n + 2); // Обчислити (n+2)-ге число Фібоначчі
        int b = 2;
        if(n == 0){
            b = 1;
        } else if(n == 1){
            // Нічого не робити, b залишається 2
        } else {
            for (int i = 2; i <= n; i++) {
                b *= 2; // Обчислити 2^n
            }
        }
        System.out.println("F(n+2) = " + a);
        System.out.println("2^n = " + b);
        if(a < b){
            return true; // Повернути true, якщо F(n+2) < 2^n
        } else {
            return false; // Повернути false, якщо F(n+2) >= 2^n
        }
    }
}
