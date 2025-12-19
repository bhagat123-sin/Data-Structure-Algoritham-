public class Insertion {

    public static void InsertionSort(int arr[]){
         for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

//  Find out the correct Position on insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
         }
    }

    public static void ArrPrint(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[] = {3,2,4,5,1};
        InsertionSort(arr);
        ArrPrint(arr);
    }
}
