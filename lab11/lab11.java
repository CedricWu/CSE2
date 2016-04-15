// Yuxin WU, Mar. 25th
// lab 11, Using Arrays

import java.util.Random; //import a random number
import java.util.Scanner;


public class lab11{
                // main method required for every Java program
               public static void main(String[] args) {
                   
                   
                   
                          
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(100); //store the random number from 0 to 100
            int randomInt2 = randomGenerator.nextInt(100); // store the second random number from o to 100
            int [] firstnum = new int [50]; // delare the string array
            
            for(int p=0; p<50; p++){
                  
                  firstnum[p]=randomGenerator.nextInt(100);
                  
            }
            // int [] studentname = new int [Numstudent]; // declare an array
          
          
           int index = 0;
           int min = firstnum[0];
           for (int i=1; i<firstnum.length; i++){
           if (firstnum[i] < min) {
            min = firstnum[i];
            index = i;
            }
            }
            System.out.println("min: " +index);
            
           int indexmax = 0;
           int max = firstnum[49];
           for (int j=1; j<firstnum.length; j++){
           if (firstnum[j] > max) {
            max = firstnum[j];
            indexmax = j;
            }
            }
            System.out.println("max: " +indexmax); 
            
            int [] secondnum = new int [50];
            secondnum[1]=randomInt;
            secondnum[2]=randomInt + randomInt2;
            
            for(int k=3; k<=49; k++){
                secondnum[k]=secondnum[k-1]+secondnum[k-2];
            }
            
            
            int index2 = 0;
           int min2 = firstnum[0];
            System.out.println("min: " +min2);
            
           int indexmax2 = 0;
           int max2 = secondnum[49];
            System.out.println("max: " +max2); 
            
             Scanner myScanner = new Scanner( System.in );
             System.out.print("Enter an Integer: ");
            
            
            myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("You need an integer: "); // prompt new input
}

int INTinput = myScanner.nextInt(); // store that integer value

            for(int t=1; t<secondnum.length+1; t++){
                if(secondnum[t]==INTinput){
                    break;
                }
                else{
                    System.out.println("integer isn't in the array" );
                    System.out.println("above is " + secondnum[t+1]);
                    System.out.println("below is " + secondnum[t-1]);
                break;
                }
            }
            
            



}
}