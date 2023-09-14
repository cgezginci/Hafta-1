import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, n,min,max;

        System.out.print("Kaç tane sayı giriceksiniz: ");
        n = input.nextInt();
        System.out.print("1. Sayıyı Girin:");
        number = input.nextInt();
        min = number;
        max = min;
        for (int i =2; i<=n; i++){
            System.out.print(i + ". Sayıyı girin:");
            number = input.nextInt();


            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }

        }
        System.out.println("En büyük sayı: "+ max);
        System.out.print("En küçük sayı: "+ min);
    }
}
