
import java.util.*;

public class Session8{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        char[][] charsArray = {{'x', 'c', 'y', 'x'}, {'c', 't', 's', 'c'}, {'m', 'r', 'z', 'r'}};

        //General methods output
        System.out.println("1. Element count: " + getElementCount(charsArray));
        System.out.println("2. Total of Cs is: "+getTotalCs(charsArray));

        System.out.println("Enter a char: ");
         char x= reader.next().charAt(0);
        System.out.println("Enter a row where to look for the char ");
         int row= reader.nextInt();
        System.out.println("3. Number of "+x+" in row "+row+" is: "+getRowTotal(charsArray,x,row));

        System.out.println("Enter a char ");
         char r= reader.next().charAt(0);
        System.out.println("4. Row where "+r+" appears more times in the row: "+getHighestInRow(charsArray,r));

        System.out.println("5. Average of Cs is: "+getAverageCs(charsArray));

        reader.close();
    }

    /*
     * Method to calculate the total number of elements
     * @param array Array of values
     * @return number of elements
     */
    public static int getTotalCs(char [][] array){

        char c='c';
        int count=0;

        for (int i=0; i<array.length; i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == c){
                    count++;
                }
            }
        }

        return count;
    }






    public static int getRowTotal(char[][] array, char x, int r){

        int count=0;

        for(int i=0;i<array[r].length;i++){
            if(array[r][i] == x){
                count++;
            }
        }

        return count;
    }

    public static int getHighestInRow(char[][] array,char x){

        int c1=0;
        int c2=0;
        int c3=0;

        for(int i=0;i<array[0].length;i++){
            if(array[0][i] == x){
                c1++;
            }
        }
        for(int i=0;i<array[1].length;i++){
            if(array[1][i] == x){
                c2++;
            }
        }
        for(int i=0;i<array[2].length;i++){
            if(array[2][i] == x){
                c3++;
            }
        }

        int index=0;

        if(c1>c2 && c1>c3){
            index=1;
        }else if(c2>c1 && c2>c3){
            index=2;
        }else if(c3>c1 && c3>c2){
            index=3;
        }
        return index;
    }


    public static double getAverageCs(char [][] array){

        double average=((double)getTotalCs(array))/((double)getElementCount(array));

    return average;
    }
}


