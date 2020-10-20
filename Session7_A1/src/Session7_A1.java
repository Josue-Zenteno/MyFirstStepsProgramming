/*
Author: Sergio Silvestre Pavón & Josué Zenteno Yave
Date(dd/mm/yyyy): 20/11/2018
Language: English
Version:1.0
 */
import java.util.Scanner;

public class Session7_A1 {

    private static final int MAX_COLUMNS = 10;
    private static final int MIN_COLUMNS = 3;
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 3;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rows, columns;
        boolean complete = false;
        boolean[][] tables;
        boolean booked =false;

        // 1. Setup
        do {
            System.out.println("Enter number of rows ["+ MIN_ROWS + ","+MAX_ROWS+"]");
            rows = reader.nextInt();
        } while (rows < MIN_ROWS || rows > MAX_ROWS);
        do {
            System.out.println("Enter number of columns ["+ MIN_COLUMNS + ","+MAX_COLUMNS+"]");
            columns = reader.nextInt();
        } while (columns < MIN_COLUMNS || columns > MAX_COLUMNS);
        tables = new boolean[rows][columns];

        // 2. Table booking
        do{
            // Select table
            int r, c;
            System.out.println("Enter a table to book: ");
            do {
                System.out.println("Enter row [1, "+ rows +"]");
                r = reader.nextInt();
            } while (r < 1 || r > rows);
            do {
                System.out.println("Enter column [1, " + columns +"]");
                c = reader.nextInt();
            } while (c < 1|| c > columns);

            for(int i=0;i<rows;i++){
                System.out.println("");
                for(int j=0;i<columns;j++){

                        if(tables[r-1][c-1] == tables[i][j]){
                            booked=true;
                        }
                        if(tables[i][j] == true){
                            System.out.println("x ");
                        }
                        else{
                            System.out.println("o ");
                        }
                }
            }

            int n=rows*columns;
            int x=0;

            while(x<n){
                for(int i=0;i<rows;i++){

                    for(int j=0;j<columns;j++){

                        if(tables[i][j] == true){
                            x=x+1;
                        }

                    }
                }
            }

            if(x == n){
              complete=false;
            }

        } while (!complete);

        System.out.println("No more tables available in the restaurant.");
        reader.close();
    }

}
