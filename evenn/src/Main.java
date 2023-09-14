import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı girin: ");
            k = input.nextInt();
            if (k % 4 == 0){
                toplam += k;
            }
        } while (k % 2 == 0);
            System.out.print(toplam);
    }
}
