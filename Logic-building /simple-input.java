import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (sum >= 0) {
            number = scanner.nextInt();
            sum += number;
            
            if (number < 0 && sum<0) {
                break; 
            }
            
            System.out.println(number);
        }
    }
}
