public class Main {

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void reverse(int[] arr) {
        int x = 0;
        int y = arr.length - 1;

        while (x < y) {
            swap(arr, x, y);
            x++;
            y--;
        }
    }

    public static void main(String args[]) {
        int[] arr = {4, 6, 3, 2, 1};
        reverse(arr);

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
