 import java.nio.channels.Pipe.SourceChannel;

public class OddEven {

    public static void Fun(int n){

    // if(n%2 == 0){
    //     System.out.println("even");
    // }else{
    //     System.out.println("Odd");
    // }

    int bit = 1;
    if((n & bit)==0){
        System.out.println("Even num");
    }else{
        System.out.println("Odd num");
    }
    }

     public static int Getith(int n, int i){
         int bitMark = 1<<i;
         if((n&bitMark) == 0){
            return 0;
         }else{
            return 1;
         }
    }

    public static int Setith(int n, int i){
        int bitMark = 1<<i;
        return n|bitMark;
    }

    public static int Clearith(int n, int i){
        int bitMark = ~(i<<i);
        return n&bitMark;
    }

    public static int UpdateBit(int n, int i, int newBit ){

        if (newBit == 0){
            return Clearith(n,i);
        }else{
            return Setith(n,i);
        }
        // OR 
        // n = Clearith(n,i);
        // int bitMark = newBit<<i;
        // return n | bitMark;
    }

    public static int ClearBit(int n, int i){
        int bitMark = (~0)<<i;
        return n & bitMark;
    }
    public static int ClearBitRange(int n , int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMark = a|b;
        return n & bitMark;
    }
    public static boolean IsPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int CountSetBit(int n){
        int count = 0;
        while(n>0){
        if((n&1) != 0){ // Lsb
            count++;
        }
        n = n>>1;
    }
        return count;
    }

    public static int FastExponetion(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans = ans * a;

            }
            a = a* a;
            n =  n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
    System.out.println(FastExponetion(3,5));  
    }
}