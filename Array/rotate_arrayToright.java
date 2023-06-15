public class Main {

   

    public static void rotate(int[] arr) {
        
        int y = arr.length - 2;
        int store=arr[y+1];

        while (y>=0) {
            arr[y+1]=arr[y];
            y--;
            
        }

        arr[0]=store;

    }

    public static void main(String args[]) {
        int[] arr = {4, 6, 3, 2, 1, 7, 10};
        rotate(arr);

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
