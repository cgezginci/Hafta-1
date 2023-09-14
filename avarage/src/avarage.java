import java.util.Scanner;
public class avarage {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int notSayisi = 0;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            notSayisi++;
        }

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            notSayisi++;
        }

        System.out.print("Türkçe notunuzu girin: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            notSayisi++;
        }

        System.out.print("Kimya notunuzu girin: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            notSayisi++;
        }

        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            notSayisi++;
        }

        double ort = (double) toplam / notSayisi;

        if (ort <= 55 && notSayisi > 0) {
            System.out.println("Sınıfı geçemediniz.");
        } else if (notSayisi > 0) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Hiçbir geçerli not girilmedi.");
        }

        if (notSayisi > 0) {
            System.out.println("Ortalamanız " + ort);
        }

    }
}
