/*
Author: Sergio Silvestre Pavón & Josué Zenteno Yave
Date(dd/mm/yyyy): 30/10/2018
Language: English
Version:1.0
 */
import java.util.*;
public class HomeLettings {
    public static void main(String[] args) {
        //We define the scanner settings
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        //We create the variables
        int selection;
        int selectionn;
        int selectionnn;
        int days;
        int days2;
        int chose;
        final double S = 75.50;
        final double L= 54.50;
        final double one= 82.50;
        double SF;
        double LF;
        double oneF;
        double finalprice;

        //We show the welcome message
        System.out.println("Welcome to our Home lettings application");
        //We show the different options
        System.out.println("Chose one:");
        System.out.println("1)Register a new user");
        System.out.println("2)Show my discount");
        System.out.println("3)Show result");
        System.out.println("4)Exit" );
        selection=keyboard.nextInt();
        //We start the Switch
        while(selection != 1){
            System.out.println("Chose the first option please");
            selectionn=keyboard.nextInt();
    }
        switch(selectionn){
            case 1:
                System.out.println("Introduce your full name: ");
                String name = keyboard.nextLine();
                System.out.println("Chose the term between: ");
                System.out.println("1)Short term");
                System.out.println("2) Long term");
                System.out.println("3) One night");
                selectionnn=keyboard.nextInt();
                switch(selectionnn){
                    case 1:
                        String rent=new String("Short term");
                        break;
                    case 2:
                        String rent2=new String("Long term");
                        break;
                    case 3:
                        String rent3=new String("One night");
                        break;
                    default:
                        System.out.println("No rent selected");
                }
                System.out.println("Write the number of days that you want to rent the house in this range[1,30]");
                days=keyboard.nextInt();
                if(days<1 || days>30){
                    System.out.println("Out of range, write another value: ");
                    days2=keyboard.nextInt();
                }
                System.out.println("Are you older than 65?. Chose [1] if you're older or [2] if you're not");
                chose=keyboard.nextInt();
                switch(chose){
                    case 1:

                        break;
                    case 2:
                        break;
                }
            break;
            case 2:
                if(days>=10 || days2>=10){

                }
                if((days>=15 || days2>=15) && chose == 1){

                }
                if (chose == 1) {

                }
                break;
            case 3:

                break;


        }

    }
}
