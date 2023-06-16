import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scanner =new Scanner(System.in);

        int total=scanner.nextInt();
        int multipleof=scanner.nextInt();

        int count=0;
        int n=1;

        while(count<total){

            if((3*(n)+2)%multipleof!=0){
                System.out.println((3*(n)+2));
                n++;
                count++;
            }
            else{
                n++;

            }



        }

    }
}
