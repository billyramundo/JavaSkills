import java.util.*;

public class RatRoute {
    char[][] myBoard;
    int myCheeseRow;
    int myCheeseCol;
    public int numRoutes(String[] enc) {
        int ratRow = 0;
        int ratCol = 0;
        myBoard = new char[enc.length][enc[0].length()];
        for(int r = 0; r < myBoard.length; r++) {
            for(int c = 0; c <myBoard[0].length; c++) {
                myBoard[r][c] = enc[r].charAt(c);
                if(myBoard[r][c] == 'R') {
                    ratRow = r;
                    ratCol = c;
                }
                else if(myBoard[r][c] == 'C') {
                    myCheeseRow = r;
                    myCheeseCol = c;
                }
            }
        }
        return moveCount(ratRow, ratCol);
    }

    private int moveCount(int r, int c) {
        if(r < 0 || c < 0 || r >= myBoard.length || c >= myBoard[0].length) return 0;
        if(myBoard[r][c] == 'X') return 0;
        if(r == myCheeseRow && c == myCheeseCol) return -1;

        int distanceNow = cheese

    }
}

