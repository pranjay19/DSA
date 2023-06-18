import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int front = N;
        int end = N;

        for (int i = 1; i <= (2 * N) - 1; i++) {

            for (int j = 1; j <= (2 * N) - 1; j++) {

                if (j <= front || j >= end) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if (i < N) {
                front--;
                end++;
            } else {
                front++;
                end--;
            }
        }
    }
}
