import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        double b;
        System.out.print("A sayısını girin: ");
        a = input.nextInt();
        System.out.print("B sayısını girin: ");
        b = input.nextDouble();

        double sayia = a;
        int sayib = (int) b;

        System.out.println(sayia);
        System.out.print(sayib);

    }
}
