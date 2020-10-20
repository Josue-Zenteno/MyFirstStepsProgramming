/*
Author: Sergio Silvestre Pavón & Josué Zenteno Yave
Date(dd/mm/yyyy): 13/11/2018
Language: English
Version:1.0
 */
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        //We define the scanner settings
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);

        //We introduce the variables
        int r; //Number of rows
        int c; //number of columns
        int compo;

        //We ask for the number of rows
        System.out.println("Introduce the number of rows: ");
        r= keyboard.nextInt();

        //We ask for the number of columns
        System.out.println("Introduce the number of columns: ");
        c= keyboard.nextInt();

        //We'll create and fill the matrix
        int [][] m1 = new int [r][c];
        int[][] m2= new int [c][r];
        //We use a for due to fill the vector
        for (int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
                System.out.println("Introduce the components of the matrix: "+i+j);
                compo= keyboard.nextInt();
                m1[i][j]=compo;
                m2[j][i]=compo;
            }
        }
        System.out.println(m1);
        System.out.println(m2);
    }
}
