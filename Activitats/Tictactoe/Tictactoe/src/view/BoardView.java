package view;

import java.util.Scanner;

public class BoardView {

    public int getValidInt(String prompt) {

        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print(prompt);
            String input = in.nextLine();
            int num=0;
            try
            {
                num = Integer.parseInt(input);
            }
            catch(Exception e)
            {
                System.out.println("Invalid integer!");
                continue;
            }
            if(num<0 || num>2)
            {
                System.out.println("Integer must be between 0 and 2");
                continue;
            }
            return num;
        }
    }

    public void printBoard(int[][] A) {

        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {

            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");

        }

    }



}
