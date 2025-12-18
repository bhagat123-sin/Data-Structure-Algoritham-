public class Selecsion{
    public static void SelecsionSort(int arr[]){
        for(int i = 0 ; i<arr.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j <arr.length ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void SelecsionSort1(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String []args){
        int arr[] = {4,3,2,5,1};
        SelecsionSort(arr);
        SelecsionSort1(arr);

    }
}