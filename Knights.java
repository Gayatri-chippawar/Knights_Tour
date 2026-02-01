package Backtracking;

public class KnightsTour2 {

    static  int[] rowMove = {-2,-1,1,2,2,1,-1,-2};
    static  int[] colMove = {1,2,2,1,-1,-2,-2,-1};

    public static boolean isSafe(int[][] board, int r, int c,int n){
        return (r>=0 && c>=0 && r<n && c<n && board[r][c]==-1);
    }
    public static boolean knightTour(int[][] board, int r, int c,int n,int moveCount){

        //base condition
        if(moveCount == n*n){
            return true;
        }

        for (int i=0; i<8; i++){//knight moves are always 8, independent of board size
            int nextR = r+rowMove[i];
            int nextC = c+colMove[i];

            if(isSafe(board,nextR,nextC,n)){
                board[nextR][nextC] = moveCount;

                if(knightTour(board,nextR,nextC,n,moveCount+1)){
                    return true;
                }
                board[nextR][nextC] = -1;
            }
        }
        return false;
    }

    public static void printBoard(int[][] board){
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=8;
        int[][] board = new int[n][n];

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length;j++){
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;

        if(knightTour(board,0,0,n,1)){
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }

    }

}
