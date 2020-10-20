import java.util.Scanner;
public class Session9_A1 {

    private static final int MAX_COLUMNS = 10;
    private static final int MIN_COLUMNS = 3;
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 3;
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        boolean[][] tables;

        // 1. Setup Restaurant
        tables = setupRestaurant();

        // 2. Table booking
        do{
            // Select table
            int r, c;
            System.out.println("Enter a table to book: ");
            do {
                System.out.println("Enter row [1, "+ tables.length +"]");
                r = reader.nextInt();
            } while (r < 1 || r > tables.length);
            do {
                System.out.println("Enter column [1, " + tables[0].length +"]");
                c = reader.nextInt();
            } while (c < 1|| c > tables[0].length);

            // Check if table was previously booked
            if (!isBooked(tables, r, c)){

                //If available, make a booking
                tables = bookTable(tables, r, c);

                //Show status
                showStatus(tables);
                /*
                //Show available tables in the row below
                showTablesBelow(tables, r);
                */
                // If it was booked, show error
            }else
                System.out.println("ERROR: This table was previously booked");

            //Check if the restaurant is complete
        }while (!isComplete(tables));
        System.out.println("No more tables available in the restaurant.");
        reader.close();

    }
    //1st Method
    public static boolean [][] setupRestaurant(){

        int r;
        int c;

        do {
            System.out.println("Enter number of rows ["+ MIN_ROWS + ","+MAX_ROWS+"]");
             r = reader.nextInt();
        } while (r < MIN_ROWS || r > MAX_ROWS);

        do {
            System.out.println("Enter number of columns ["+ MIN_COLUMNS + ","+MAX_COLUMNS+"]");
             c = reader.nextInt();
        } while (c < MIN_COLUMNS || c > MAX_COLUMNS);

        boolean [][] tables = new boolean[r][c];

        return tables;
    }
    //2nd method
    public static boolean [][] bookTable(boolean [][] tables, int r, int c){

        tables[r-1][c-1]=true;

        return tables;
    }
    public static boolean isBooked(boolean[][] tables,int r, int c){

        boolean booked=false;

        if(tables[r-1][c-1] == true) {
            booked = true;
        }
        return booked;
    }
    public static void showStatus(boolean[][]tables){

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

    }
    /*
    public static void showTablesBelow(boolean[][]tables,int r){

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
*/
    }
    public static boolean isComplete(boolean[][]tables){
        boolean complete=true;

        for(int i=0;i<tables.length;i++){
            for(int j=0;j<tables[0].length;j++){
                if(tables[i][j] == false){
                    complete=false;
                }
            }
        }
        return complete;
    }

}