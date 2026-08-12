
import java.util.ArrayList;
import java.util.List;

/*  N x N chessboard
    N queens
    print all solution where queens are safe
    Time complexity -> O(n^n)
*/
public class nqueen {
    public static boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j = 0; j < board.length ;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--,r--) {
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++,r--) {
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for (int c = col; c >= 0 && r <board.length; c--,r++) {
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++,r++) {
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board , List<List<String>> allboard){
        String row ;
        List<String> newboard = new ArrayList<>();

        for (char[] board1 : board) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board1[j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allboard.add(newboard);
    }
    public static void helper(char[][] board,List<List<String>> allboard ,int col){
        if(col == board.length) {
            saveBoard(board, allboard);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allboard, col+1);
                board[row][col] = '.';
            }
        }

    }
    public static  List<List<String>> solveNqueen(int n){
        List<List<String>> allboard = new ArrayList<>();
        char [][] board = new char[n][n];

        helper(board, allboard, 0);
        return allboard;

    }
    public static void main(String[] args) {
        int n = 4;

        List<List<String>> solutions = solveNqueen(n);

        System.out.println("Total solutions for " + n + "-Queens: " + solutions.size() + "\n");
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
            System.out.println();
        }
    
    }
}