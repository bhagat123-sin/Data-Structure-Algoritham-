import java.util.Arrays;
public class InbuilFun {
    public static void Prints(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr ={2,4,5,3,1,8,9,12,4,31,52};
        Arrays.sort(arr);
        Arrays.sort(arr , 0 , 5);
        Prints(arr);
    }
}

