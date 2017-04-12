/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 14
* Description: Switch Excercise
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
* 
*
*   
*---------------------------------------------------------------------------------------
*/
import java.util.Random;

public class Exercise16 {

    public static void main ( String [] strArgs) {
        Random rdmNumber = new Random();

       
        int intdice1 = rdmNumber.nextInt(6)+1;
        int intdice2 = rdmNumber.nextInt(6)+1;
        int intcounter = 0;
        
        do{
            if (( intdice1 == 6) && (intdice2 ==6))
                intdice1 + intdice2

     }
     while (intcounter++ == 1000)
        System.out.println("The number rolled for di 1 is: "+intdice1);
        System.out.println("The number rolled for di 2 is: "+intdice2);
    
        System.out.println("The amount of pairs rolled is: "+(intdice1+intdice2));



 }
}