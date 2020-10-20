package modularity;
import java.util.Scanner;
public class moduled_A7 {

    private static final int MAX_COLUMNS = 10;
    private static final int MIN_COLUMNS = 3;
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 3;
    private static int rows;
    private static int columns;
    private static boolean [][] asientos;
    private static int occupied;
    private static boolean complete= false;

    //main method
    public static void main(String[] args) {

        inicializar();
        int r = pedirFilaAsiento();
        int c= pedirColumnaAsiento();
        boolean asiento = reservarAsiento(r, c);
        int total_available = comprobarLibresEnFila(r);
        boolean complete = mostrarSala(total_available);


    }

    //1st method
    public static boolean[][] inicializar(){

        Scanner reader = new Scanner(System.in);


        do {
            System.out.println("Enter number of rows ["+ MIN_ROWS + ","+MAX_ROWS+"]");
            rows = reader.nextInt();
        } while (rows < MIN_ROWS || rows > MAX_ROWS);
        do {
            System.out.println("Enter number of columns ["+ MIN_COLUMNS + ","+MAX_COLUMNS+"]");
            columns = reader.nextInt();
        } while (columns < MIN_COLUMNS || columns > MAX_COLUMNS);


        return asientos = new boolean[rows][columns];
    }

    //4th method
    public static int pedirFilaAsiento(){

        Scanner reader = new Scanner(System.in);
        System.out.println("Select the row of the seat: ");

        int r;

        do {
            System.out.println("Enter row [1, "+ rows +"]");
            r = reader.nextInt();
        } while (r < 1 || r > rows);

        System.out.println("the row selected is"+ r);

        return r;
    }

    //5th method
    public static int pedirColumnaAsiento(){

        Scanner reader = new Scanner(System.in);
        System.out.println("Select the column of the seat: ");

        int c;

        do {
            System.out.println("Enter column [1, " + columns +"]");
            c = reader.nextInt();
        } while (c < 1|| c > columns);

        System.out.println("the column selected is"+ c);

        return c;
    }

    //6th method
    public static boolean reservarAsiento(int r, int c){

        if(!asientos[r-1][c-1]) {
            // if not, make a booking
            asientos[r - 1][c - 1] = true;
            // Show tables and count occupied
            int occupied = 0;

            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[0].length; j++) {
                    if (asientos[i][j]) {
                        System.out.print("X ");
                        occupied++;
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
        }
        else {
            // If it was booked, show error
            System.out.println("ERROR: This seat was previously booked");
        }

        return asientos[r - 1][c - 1];
    }

    //7th method
    public static int comprobarLibresEnFila(int r){

        //Show tables available in row below
        int available = 0;
        //If I selected the last row, I show tables available at first row
        if ((r) == rows){
            for (int j = 0; j < columns; j++){
                if (!asientos[0][j])
                    available++;
            }
            System.out.println("Tables available at row " + 1 + ": "+ available);
            ////If I selected the row r, I show tables available at row r+1
        }else{
            for (int j = 0; j < columns; j++){
                if (!asientos[r][j])
                    available++;
            }
            System.out.println("Tables available at row " + (r+1) + ": "+ available);
        }
        System.out.println();
        int total_available = (rows * columns) - occupied;

        return total_available;
    }



    //9th method
    public static boolean mostrarSala(int total_available){

        // Check if restaurant is complete

        return complete = (total_available == 0);
    }
}
