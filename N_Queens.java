public class N_Queens{

    public static boolean itsafe(char board[][], int row, int col){
        // vertical
        for(int i=row-1;i>=0;i--){
            if(board [i] [col] == 'Q'){
                return false;
            }
        }
        // digonal_left
        for(int i=row-1, j=col-1; i>=0 && j>=0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // digonal_right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueen(char board[][],int row){

        if(row == board.length){
            PrintBoard(board);
            return;
        }
        for(int j = 0; j<board.length;j++){
            if(itsafe(board, row, j)){
            board[row][j] = 'Q';
            nqueen(board, row+1);
            board[row][j] = 'x';
            }
        }
    }
    public static void PrintBoard(char board[][]){
         System.out.println("___________ Board ___________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nqueen(board, 0);
    }
}