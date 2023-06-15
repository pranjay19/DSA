import java.util.Scanner;

public class Main{

    static boolean isarmstrong(int number){

        int digits=(int)Math.log10(number)+1;

        int remainder=0;
        int new_num=0;
        int old_num=number;

        while(number!=0){

            remainder=number%10;
            new_num=(new_num)+(int)Math.pow(remainder,digits);
            number/=10;

        }

        if(old_num==new_num){
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int Number=scanner.nextInt();

        if(isarmstrong(Number)){
            System.out.println("Yes! this is an armstrong number.");
        }
        else{
            System.out.println("No! this is not an armstrong number.");
        }

    }
}
