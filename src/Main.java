import java.util.*;
import java.lang.System;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдання №1");

        double x, precision = 0.00001;

        System.out.print("Введіть значення х: ");
        x = scanner.nextDouble();

        double f_left = Math.sin(x);
//        Обчислення значення за допомогою степеневого ряду
        double f_right = x;
        double A = x;

        int k = 1;

        do {
            A *=  (-1) * Math.pow(x, 2) / ((2 * k) * (2 * k + 1));
            f_right += A;
            k++;
        } while (Math.abs(A) >= precision);

        System.out.println("Кількість додатнів: " + k);
        System.out.println("Ліва частина: " + f_left);
        System.out.println("Права частина: " + f_right);
        System.out.println("Різниця лівої частини до правої: " + (f_left - f_right));
    }
}
