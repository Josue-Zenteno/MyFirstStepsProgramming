/*
METODO SEAT BOOKING, FALLA PORQUE NOS FALTA UNA FORMA DE METER COMO DATO LA MATRIZ Y YA PODER OPERAR

PREGUNTAR SI LOS ASIENTOS SE RESERVAN EN ORDEN O SE RESERVAN SEGUN EL USUARIO
 */

import java.util.Scanner;
public class Debug_Bus {
    //Global variables
    private static final Scanner reader = new Scanner(System.in);
    /***********************************************************************************************************************************************
     MAIN PROGRAM
     **********************************************************************************************************************************************/
    public static void main(String[] args) {

        //Variable for the selection of the user
        int n;

        boolean exit=false; //Boolean variable to determine the end of the loop
        boolean first=true;
        boolean ya_config=false;
        boolean [][] seats =null;
        boolean [][] seats2=null;
        boolean [][] seats3=null;
        boolean ya_filled=false;
        do{
            n=menu1();
            //Block the other options while 1 is not selected first
            while(first){

                if (n!=1){
                    System.out.println("Error, if it is your first time, please select the first option");
                    n=menu1();
                } else if(n == 1){
                    first=false;
                }

            }

            //The beginning
            switch(n){

                case 1:
                    if(ya_config == false){
                        seats = System_Setup();
                        ya_config=true;
                    } else{
                        System.out.println("You cannot configure the bus again");
                    }
                    break;
                case 2:
                    seats = Seat_Booking(seats,ya_filled);
                    break;
                case 3:
                    seats = Seat_Cancellation(seats);
                    break;
                case 4:
                    Show_Status(seats);
                    break;
            }


        }while(Exit(n)!=true);

        reader.close();
    }

    /****************************************************************************************************************************************************
     METHODS
     ****************************************************************************************************************************************************/
    public static int menu1(){
        int n;
        System.out.println("Select one option: \n1. System setup \n2. Seat Booking \n3. Seat cancellation \n4. Show Status \n5. Exit  ");
        n = reader.nextInt();
        return n;
    }
    public static boolean Exit(int n){
        boolean exit=false;
        if(n == 5){
            exit=true;
        }
        return exit;
    }
    public static boolean [][] System_Setup(){

        int r,c;

        final int MAX_COLUMNS = 4;
        final int MIN_COLUMNS = 3;
        final int MAX_ROWS = 10;
        final int MIN_ROWS = 3;

        do {
            System.out.println("Enter number of rows ["+ MIN_ROWS + ","+MAX_ROWS+"]");
            r = reader.nextInt();
        } while (r < MIN_ROWS || r > MAX_ROWS);

        do {
            System.out.println("Enter number of columns ["+ MIN_COLUMNS + ","+MAX_COLUMNS+"]");
            c = reader.nextInt();
        } while (c < MIN_COLUMNS || c > MAX_COLUMNS);

        boolean[][]seats = new boolean[r][c];
        return seats;
    }
    public static boolean[][] Seat_Booking(boolean [][] seats, boolean ya_filled){

        int n_seat;

        do{
            System.out.println("Introduce the number of seats that you want to book (max 2)");
            n_seat = reader.nextInt();
        }while (n_seat<1 || n_seat>2);

        boolean [][] seat1 = seats;

       if(ya_filled == false){
           for(int i=0;i<seat1.length;i++){
               for(int j=0;j<seat1[0].length;j++){
                   seat1[i][j]=false;
               }
           }
           ya_filled=true;
       }

        int max = n_seat;
        int booked = 0;

        for(int i=0;i<seat1.length || booked == max ;i++){
            for(int j=0;j<seat1[0].length;j++){
                if(seat1[i][j]  == false){
                    seat1[i][j] = true;
                    booked++;
                }
            }
        }
        return seat1;
    }
    public static boolean[][] Seat_Cancellation(boolean[][] seats){

        boolean [][] cancelled=seats;

        System.out.println("Introduce the row of the seat");
        int row = reader.nextInt();

        System.out.println("Introduce the column of the seat");
        int column = reader.nextInt();

        if(cancelled[row][column] == false){
            System.out.println("Error. This seat was not previously booked");
        }else{
            cancelled [row][column]=false;
            System.out.println("Your seat has been cancelled succesfully");
        }
        return cancelled;
    }
    public static void Show_Status(boolean [][] seats){

        for(int i=0;i<seats.length;i++){

            for(int j=0;j<seats.length;j++){
                if (seats[i][j] == false){
                    System.out.print("O ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    /*public static String ask_name(){
        System.out.println("Introduce your name");
        String name2 = reader.nextLine();
        return name2;
    }
    public static String ask_journey(){
        System.out.println("Introduce your journey");
        String journey= reader.nextLine();
        return journey;
    }*/
}


