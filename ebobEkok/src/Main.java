import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int i = 1;
        int ebob = 1;
        int ekok = 1;


        System.out.print("Küçük sayıyı girin.");
        n1 = input.nextInt();
        System.out.print("Büyük sayıyı girin.");
        n2 = input.nextInt();
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }

            i++;

        }
        System.out.println("Ebob değeri: " + ebob);
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;

        }
        System.out.print("Ekok değeri :" + ekok);

    }
}
