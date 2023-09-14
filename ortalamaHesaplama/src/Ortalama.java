import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu girin: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu girin: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu girin: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();

        int sonuc =(mat + fizik + kimya + turkce + tarih + muzik);
        double ort =sonuc / 6.0;
        System.out.println(ort);

        String str = ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(str);



    }

}
