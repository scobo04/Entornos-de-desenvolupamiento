package services;

import view.BoardView;

public class BoardService {
    BoardView boardView= new BoardView();


    public boolean checkRows(int[][] A){
        for(int i=0; i<A.length; i++)
        {
            if( (A[i][0]==A[i][1]) && (A[i][1]==A[i][2]) && A[i][0] !=0)
                return true;
        }
        return false;
    }

    public boolean checkCols(int[][] A){
        for(int i=0; i<A[0].length; i++)
        {
            if( (A[0][i]==A[1][i]) && (A[1][i]==A[1][i])&& A[0][i] !=0)
                return true;
        }
        return false;
    }

    public boolean checkDiags(int[][] A){
        if( (A[0][0]==A[1][1]) && (A[1][1]==A[2][2]) && A[0][0] !=0)
            return true;
        else if ((A[0][2]==A[1][1]) && (A[1][1]==A[2][0]) && A[1][1] !=0)
            return true;
        else
            return false;
    }

    public boolean checkHit(int[][] A) {

        if(checkRows(A) || checkCols(A) || checkDiags(A))
            return true;
        else
            return false;
    }

    public boolean isFree (int[][] A, int row, int col) {
        if(A[row][col] == 0)
            return true;
        else
            return false;
    }


    public boolean getWinner(String turnPrompt, int[][] A, int playerNumber) {
        System.out.println(turnPrompt);
        int row=0, col=0;
        while(true)
        {
            row = boardView.getValidInt("Enter row: ");
            col = boardView.getValidInt("Enter col: ");
            if(isFree(A,row,col))
            {
                break;
            }
            System.out.printf("[%d,%d] is already filled!\n",row,col);
        }
        A[row][col] = playerNumber;
        return checkHit(A);
    }

    public void init() {
        final int FILES = 3;
        final int COLUMNES = 3;

        final int PLAYER1= 1;
        final int PLAYER2= 2;

        int[][] grid = new int[FILES][COLUMNES];
        boolean foundWinner = false;

        boardView.printBoard(grid);

        int i=0;
        while(i<(FILES*COLUMNES))
        {
            if(i%2==0) //Player 1
            {
                if(getWinner("Player 1 turn",grid,PLAYER1))
                {
                    foundWinner=true;
                    System.out.println("Player 1 WINS!");
                    break;
                }
                boardView.printBoard(grid);
                System.out.println();
            }
            else //Player 2
            {
                if(getWinner("Player 2 turn",grid,PLAYER2))
                {
                    foundWinner=true;
                    System.out.println("Player 2 WINS!");
                    break;
                }
                boardView.printBoard(grid);
                System.out.println();
            }
            i++;
        }

        if(!foundWinner)
            System.out.println("It's a draw!");

    }//end main
}
