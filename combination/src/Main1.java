import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int faktoriyeln = 1, faktoriyelr = 1, faktoriyelnr =1;
        int n, r;


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n = input.nextInt();
        System.out.print("Bir sayı girin: ");
        r = input.nextInt();

        for (int i = 1; i<=n; i++){
            faktoriyeln *= i;
        }

        for (int i = 1; i<=r; i++){
            faktoriyelr *= i;

        }

        for (int i =1; i <= (n-r); i++){
            faktoriyelnr *= i;
        }


        int sonuc = faktoriyeln / (faktoriyelr * faktoriyelnr);

        System.out.println("C(" + n + ", " + r + ") = " + sonuc);


    }
}
