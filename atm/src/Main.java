import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select, balance=1500;
        while (right > 0){
            System.out.print("Kullanıcı adınızı girin: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi girin: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("java123")){
                System.out.println("Başarıyla Giriş yaptınız.");
            do {
                System.out.println("1. Para Yatırma\n" +
                        "2. Para Çekme\n" +
                        "3. Bakiye Sorgula\n" +
                        "4. Çıkış Yap");
                System.out.println("Yapmak istediğiniz işlemi seçiniz.: ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz tutarı girin: ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz tutarı girin: ");
                         price = input.nextInt();
                     if (price > balance){
                         System.out.println("Yetersiz Bakiye.");
                     } else {
                         balance -= price;
                     }
                     break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;

                }
            }while (select != 4);
                System.out.print("Tekrar Görüşmek Üzere.");
                break;
            }else {
                right--;
                System.out.println("Yanlış bilgi girdiniz lütfen tekrar deneyin.");
            }if (right == 0){
                System.out.println("Hesabınız bloke edilmiştir.");
            }else {
                System.out.println("Kalan hakkınız: "+ right);
            }
        }
    }
}
