import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scanner =new Scanner(System.in);

        int Num1=scanner.nextInt();
        int Num2=scanner.nextInt();

        int LCM=1;

        while(!(LCM%Num1==0 && LCM%Num2==0)){
            LCM++;
         
        }

        System.out.println(LCM);

    }
}
