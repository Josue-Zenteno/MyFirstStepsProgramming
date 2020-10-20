/*
AHORA HAY QUE IR HACIENDO LOS METODOS, EL MAIN FUNCIONA CORRECTAMENTE Y ES LO MÁS SIMPLE POSIBLE
 */
import java.util.Scanner;
public class Bus {
    private static final int MAX_COLUMNS = 4;
    private static final int MIN_COLUMNS = 3;
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 3;
    private static final Scanner reader = new Scanner(System.in);
    /***********************************************************************************************************************************************
                                                                    MAIN PROGRAM
     **********************************************************************************************************************************************/
    public static void main(String[] args) {

        //Variable for the selection of the user
        int n;


        boolean exit=false; //Boolean variable to determine the end of the loop
        boolean first=true;

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
                    System_Setup();
                    break;
                case 2:
                    System.out.println("2");
                    //Seat_Booking();
                    break;
                case 3:
                    System.out.println("3");
                    //Seat_Cancellation();
                    break;
                case 4:
                    System.out.println("4");
                    //Show_Status();
                    break;
            }

        }while(Exit(n) != true);

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
        boolean exit = false;
        if(n == 5){
            exit=true;
        }
        return exit;
    }
}



