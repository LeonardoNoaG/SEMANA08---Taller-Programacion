package Programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int fibonacci = a + b;
            System.out.print(" " + fibonacci);
            a = b;
            b = fibonacci;
        }
    }
}