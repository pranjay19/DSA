public class Main {

    public static int max(int[] arr){
        int Max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }
            else{
                continue;
            }
        }

        return Max;
    }

    public static void main(String args[]) {

        int[] Arr=new int[]{4,6,3,2,1};

        System.out.println(max(Arr));


        
        
    }
}
