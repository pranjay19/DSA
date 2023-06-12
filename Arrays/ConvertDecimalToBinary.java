import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
       int Number=scanner.nextInt();

       int binary=0;
       int remainder=0;
       int multiply=1;


       
       
       while(Number!=0){

           remainder=Number%2;
           binary=binary+remainder*multiply;

           multiply=multiply*10;

           Number=Number/2;


       }

       System.out.println(binary);

    }

}
