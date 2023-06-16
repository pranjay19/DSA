import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scanner =new Scanner(System.in);

        int Number=scanner.nextInt();

        int digits=(int)Math.log10(Number)+1;

        int odd=0;
        int even=0;

        if(digits%2==0){
            
            while(Number!=0){
                int remainder=Number%10;
                even=even+remainder;
                Number/=10;

                int remainder2=Number%10;
                odd=odd+remainder2;
                Number/=10;

            }

            System.out.println(even);
            System.out.println(odd);

        }
        else{

            while(Number!=0){
                int remainder=Number%10;
                odd=odd+remainder;
                Number/=10;

                if(Number!=0){
                    int remainder2=Number%10;
                    even=even+remainder2;
                    Number/=10;
                }
                

            }

            System.out.println(odd);
            System.out.println(even);

        }

        

    }
}
