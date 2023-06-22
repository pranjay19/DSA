import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int Number=scanner.nextInt();

        int pointer=1;

        int front=1;
        int back=0;

        int count=0;

        for(int i=1;i<=Number;i++){
            
            for(int j=1;j<=Number;j++){



                if(j<=pointer){
                    if(count==0){
                         System.out.print(back);
                         System.out.print(" ");
                         count++;
                    
                    }
                    else if(count==1){
                         System.out.print(front);
                         System.out.print(" ");
                         count++;

                    }
                    else{
                         System.out.print(back+front);
                         System.out.print(" ");
                         int front_new=front;
                         front=front+back;
                         
                         back=front_new;
                    
                    }
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }

            pointer++;
            
            System.out.println();
        }

    }
}
