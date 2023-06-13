
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();

        int digits=(int)Math.log10(number)+1;
        int remainder=0;

        int decimal=0;

        int powers=digits-1;
        

        while(number!=0){
            remainder=number%10;
            decimal=decimal+remainder*(int)Math.pow(2,powers);
            powers--;

            number=number/10;
            
        }

        System.out.println(decimal);


    }
}
