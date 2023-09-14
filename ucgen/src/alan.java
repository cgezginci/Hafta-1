import java.util.Scanner;
public class alan {
    public static void main(String[] args) {

        double a, b, c, u, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı girin: ");
        a = input.nextDouble();
        System.out.print("2. Kenarı Girin: ");
        b = input.nextDouble();
        System.out.print("3. Kenarı Girin: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("üçgenin alanı: " + alan);

    }
}
