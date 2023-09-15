import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("A sayısnı girin: ");
        a = input.nextInt();
        System.out.print("B sayısnı girin: ");
        b = input.nextInt();
        System.out.print("C sayısnı girin: ");
        c = input.nextInt();
        int toplam = a+b*c-b;
        System.out.print(toplam);

    }
}
