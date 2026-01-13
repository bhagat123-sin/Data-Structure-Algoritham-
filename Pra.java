import java.util.*;
public class Pra {
    // searching Key

    public static boolean Search(int Matrix[][], int key){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Key No.");
        int key1 = sc1.nextInt();
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                 if(Matrix[i][j] == key1){
                    System.out.println("key is Found ("+"Row -> "+i+" Column -> "+j+")");
                    return true;
                 }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrix[][] = new int[3][3];
        int n = 3, m = 3;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i =0 ; i<n ; i++){
            for(int j = 0;j<m ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(Matrix, 5);
    } 
}