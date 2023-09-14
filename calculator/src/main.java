import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int no1, no2, islem;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        no1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        no2 = input.nextInt();

        System.out.println("1.Topla\n2.Çıkart\n3.Çarp\n4.Böl");
        System.out.print("Seçiminiz: ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.print(no1 + no2);
                break;
            case 2:
                System.out.print(no1 - no2);
                break;
            case 3:
                System.out.print(no1 * no2);
                break;
            case 4:
                if (no2 == 0) {
                    System.out.print("Bir sayı 0'a bölünemez.");
                }else{
                System.out.print(no1 / no2);
                }
                break;
            default:
                System.out.print("Hatalı Seçim Yaptınız!");
        }

    }
}
