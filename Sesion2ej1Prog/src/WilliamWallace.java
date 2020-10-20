/*
Author: Sergio Silvestre Pavón & Josué Zenteno Yave
Date(dd/mm/yyyy): 16/10/2018
Language: English
Version:1.0
 */
import java.util.*;
public class WilliamWallace {
    public static void main(String[] args) {

        //We define the scanner settings
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        //We define the different variables
        String cad1= new String("THEY MAY TAKE AWAY OUR LIVES, BUT THEY WILL NEVER TAKE OUR FREEDOM!");
        String cad2= new String("  william wallace");
        String cad3= new String(cad1+cad2);
        int length1 = cad1.length();
        int length2 = cad2.length();
        int subs;
        int concat = cad3.indexOf ("!");
        final int NUM_RATINGS=125;
        double division;
        double division2;
        //We show the variety of messages to the user
        System.out.println(cad1);
        System.out.println("The total number of quote's characters is: "+ length1 );
        System.out.println(cad2);
        System.out.println("The total number of name's characters is: "+ length2 );
        System.out.println(cad1+cad2);
        subs=length1-length2;
        System.out.println("The result of the subtraction is: "+subs);
        System.out.println("The position of \"!\" is: "+concat);
        division=concat/subs;
        System.out.println("The result of the division is: "+division);
        short change=(short)division;
        System.out.println("The division shown as short is: "+change);
        System.out.print("Insert an integer between 1-5 with your rating: ");
        int rate = keyboard.nextInt();
        keyboard.close();
        System.out.println("Your rating is: "+rate);
        division2=NUM_RATINGS/rate;
        System.out.println("The result of the division2 is: "+division2);
    }
}
