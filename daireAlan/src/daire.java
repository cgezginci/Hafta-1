import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        int r;
        double alpha, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çap: ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsü : ");
        alpha = input.nextDouble();

        double alan = (pi * (r * r) * alpha) / 360;


        System.out.println("alan :" + alan);


    }
}
