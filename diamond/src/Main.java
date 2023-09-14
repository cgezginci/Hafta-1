import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin (tek sayı olmalı): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
        } else {

            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }


            for (int i = n - 2; i >= 1; i -= 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}