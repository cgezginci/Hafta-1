import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı girin: ");
        tutar = input.nextDouble();

        kdvOran = (tutar <= 1000) ? 0.18 : 0.08;


        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz tutar :" + tutar);
        System.out.println("Kdv oranı :" + kdvOran);
        System.out.println("Kdv tutarı :" + kdvTutar);
        System.out.println("Kdv'li tutarı :" + kdvliTutar);

    }


}

