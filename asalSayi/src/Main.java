public class Main {
    public static void main(String[] args) {

        for (int i =2; i<=100; i++){
            int k;
            for (k = 2; k<i; k++){
                if (i % k == 0)
                    break;


            }
            if (i ==k){
                System.out.println(i);
            }


        }
    }
}
