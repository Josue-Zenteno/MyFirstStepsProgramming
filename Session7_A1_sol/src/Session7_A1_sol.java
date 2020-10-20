import java.util.Scanner;

public class Session7_A1_sol {

    private static final int MAX_COLUMNS = 10;
    private static final int MIN_COLUMNS = 3;
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 3;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rows, columns;
        boolean complete = false;
        boolean[][] tables;

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

            // Check if table was previously booked
            if(!tables[r-1][c-1]){
                // if not, make a booking
                tables[r-1][c-1] = true;
                // Show tables and count occupied
                int occupied = 0;

                for(int i = 0; i < tables.length; i++) {
                    for(int j = 0; j < tables[0].length; j++) {
                        if(tables[i][j]) {
                            System.out.print("X ");
                            occupied++;
                        } else {
                            System.out.print("O ");
                        }
                    }
                    System.out.println();
                }

                //Show tables available in row below
                int available = 0;
                //If I selected the last row, I show tables available at first row
                if ((r) == rows){
                    for (int j = 0; j < columns; j++){
                        if (!tables[0][j])
                            available++;
                    }
                    System.out.println("Tables available at row " + 1 + ": "+ available);
                    ////If I selected the row r, I show tables available at row r+1
                }else{
                    for (int j = 0; j < columns; j++){
                        if (!tables[r][j])
                            available++;
                    }
                    System.out.println("Tables available at row " + (r+1) + ": "+ available);
                }
                System.out.println();
                int total_available = (rows * columns) - occupied;

                // Check if restaurant is complete
                complete = (total_available == 0);
            } else {
                // If it was booked, show error
                System.out.println("ERROR: This table was previously booked");
            }

        } while (!complete);
        System.out.println("No more tables available in the restaurant.");
        reader.close();
    }

}
