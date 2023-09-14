import java.sql.SQLOutput;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        String userPassword = "patika";
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        userName = input.nextLine();
        System.out.print("Parolanızı girin: ");
        password = input.nextLine();

        if (userName.equals("java") && password.equals(userPassword)) {
            System.out.println("Giriş Yaptınız");
        }else {

            System.out.println("Şifrenizi sıfırlamak ister misinz?");
            String answer = input.nextLine();

            if (answer.equals("evet")) {
                System.out.println("Yeni şifrenizi girin: ");
                password = input.nextLine();

                if(userPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");

                }
            }
        }


    }
}
