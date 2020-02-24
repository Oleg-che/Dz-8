package com.cherednik;

import java.util.Scanner;
/*
1) Число Фибоначи
написать метод который возвращает N-ное число фибоначи
 */
public class Main {

    public static void main(String[] args) {
        int x;
        int y = 0;
        int z = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Фибоначи");
        int number = scanner.nextInt();
        for (int i = 0; i < number ; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + " ");
         }
    }
}
