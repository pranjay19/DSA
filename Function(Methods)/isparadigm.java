import java.util.Scanner;

public class Main{

    static boolean isparadigm(int number){
        int oldnum=number;
        int new_number=0;
        int remainder=0;
        while(number!=0){
            remainder=(number)%10;
            new_number=(new_number*10)+remainder;
            number=number/10;
            

        }

     

        if(oldnum==new_number){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int Number=scanner.nextInt();

        if(isparadigm(Number)){
            System.out.println("Yes! it is a paradigm");

        }
        else{
            System.out.println("No! it is not a paradigm");
        }

    }
}
