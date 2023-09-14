import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, toplam=0;
        System.out.print("Bir Sayı Girin: ");
        k = input.nextInt();
        for (int i = 1; i<k; i++){
            if (k % i == 0){

                toplam += i;
            }
        }
        if (toplam == k){
            System.out.print(k + " Mükemmel sayıdır.");
        }else {
            System.out.print(k + " Mükemmel Sayı Değildir.");
        }

    }
}