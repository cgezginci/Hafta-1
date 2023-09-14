import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        int toplam = 0;
        int kalan;
        System.out.print("Bir sayı girin: ");
        sayi = scanner.nextInt();

        while (sayi > 0){
            kalan = sayi % 10;
            toplam += kalan;
            sayi = sayi / 10;
        }
        System.out.println("Basamakların toplamı: " + toplam);
    }
}