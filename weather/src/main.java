import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı girin: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapmayı tercih edebilirsin.");
        }else if (heat >= 5 && heat < 15) {
            System.out.print("Sinemaya gitmeyi tercih edebilirsin.");
        }else if (heat >= 15 && heat < 25) {
            System.out.print("Piknik yapmayı tercih edebilirsin.");
        }else if (heat >= 25) {
            System.out.print("Yüzmeye gitmeyi tercih edebilirsin.");
        }



    }
}
