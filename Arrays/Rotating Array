import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        int Number = scanner.nextInt();
        int rotations=scanner.nextInt();
        int digits=(int)Math.log10(Number)+1;

        int remainder=0;

        if(rotations>=0){

            rotations=rotations%digits;
            

            for(int i=0;i<rotations;i++){
                remainder=Number%10;
                Number=remainder*(int)Math.pow(10,digits-1)+Number/10;
                
            }


        }
        else{

            rotations=digits+(rotations%digits);

              for(int i=0;i<rotations;i++){
                remainder=Number%10;
                Number=remainder*(int)Math.pow(10,digits-1)+Number/10;
                
            }

        }

        System.out.println(Number);

    }
}
