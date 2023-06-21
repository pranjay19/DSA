import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int Number=scanner.nextInt();
        int start=2;
        int end=(Number*2)-2;
        
        

        for(int i=1;i<=Number;i++){
            int valstart=1;
            for(int j=1;j<=(Number*2)-1;j++){
                if(j<start || j>end){
                    if(j<Number){
                         System.out.print(valstart);
                         System.out.print(" ");
                         valstart++;
                    }
                    else{
                         System.out.print(valstart);
                         System.out.print(" ");
                         valstart--;
                    }
                   
                    
                }
                else{
                    if(j<Number){
                         System.out.print(" ");
                         System.out.print(" ");
                         valstart++;
                    }
                    else{
                         System.out.print(" ");
                         System.out.print(" ");
                         valstart--;
                    }
                }


                
                
            }

            start++;
            end--;

            System.out.println();

        }

    }
}
