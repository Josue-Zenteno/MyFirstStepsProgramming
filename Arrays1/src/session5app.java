/*
Author: Sergio Silvestre Pavón & Josué Zenteno Yave
Date(dd/mm/yyyy): 06/11/2018
Language: English
Version:1.0
 */
import java.util.*;
public class session5app {
    public static void main(String[] args) {
        //We define the scanner settings
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        //we show the welcome message
        System.out.println("Welcome to Session5 application");
        //we introduce the variables
        int selection;
        int lent;
        int compo;
        int i;
        int couple=0;
        //We use a switch for select the options
        //we ask for the value
        System.out.println("Options: ");
        System.out.println("1) Number of 6's");
        System.out.println("2) Add Up");
        System.out.println("3) Exit");
        System.out.println("Chose one");
        selection=keyboard.nextInt();
        switch(selection){
            case 1:
                //We ask for the length of the vector
                System.out.println("Introduce the lenght of the vector");
                lent= keyboard.nextInt();
                int [ ] list = new int [lent];
                //We use a for due to fill the vector
                for (i=0; i<lent; i++) {
                    System.out.println("Introduce a component");
                    compo= keyboard.nextInt();
                    list[i]=compo;

                }
                //We use another for to move trough the vector
                for (int j=0; j<list.length ; j++){
                    if(list[j]==6){
                        couple=couple;
                        if(list[j-1]==6){
                            couple=couple+1;
                        }
                    }
                }
                System.out.println("Number of couples: "+couple);
                break;
            case 2:

                break;
            case 3:
            System.out.println("Good bye");
                break;

        }
    }
}
