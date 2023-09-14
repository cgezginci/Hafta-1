import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0;
        int sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i<=k; i++){

            if (i % 3 ==0 || i % 4 ==0){
                System.out.println(i);
                toplam += i;
                sayac++;

            }
        }

        if (sayac > 0){
            double ort = (double) toplam / sayac;
            System.out.print("Ortalama "+ ort);
        }else {
            System.out.print("Değer yok.");
        }
    }
}
