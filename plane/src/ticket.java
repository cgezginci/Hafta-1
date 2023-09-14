import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        int km, age, type;
        double cost;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        type = input.nextInt();

        if (km <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.print("Hatalı giriş yaptınız.");
        } else {
            cost = km * 0.10;
            if (age < 12) {
                cost *= 0.5;
            } else if (age >= 12 && age <= 24) {
                cost *= 0.9;
            } else if (age >= 65) {
                cost *= 0.7;
            }
            if (type == 2) {
                cost *= 0.8;
            }
            System.out.print("Toplam tutar: " + cost);
        }


    }
}
