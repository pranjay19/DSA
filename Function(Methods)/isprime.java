import java.util.Scanner;
public class Main{

    static boolean prime(int number){

        boolean isprime=true;

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isprime=false;
                break;
            }
            else{
                continue;
            }

            
        }

        return isprime;

    
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int Number=scanner.nextInt();

        if(prime(Number)){
            System.out.println("Yes! the numebr is prime");

        }
        else{
            System.out.println("No! the number is not prime");
    }

    }
}
