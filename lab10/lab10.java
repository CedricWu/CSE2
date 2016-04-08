// Yuxin WU, Mar. 25th
// lab 10, Arrays

import java.util.Random; //import a random number
import java.util.Scanner;


public class lab10{
                // main method required for every Java program
               public static void main(String[] args) {
                   
                   
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(5); //store the random number from 0 to 5
            int Numstudent = randomInt +5; // the number is from 5 to 10
            
            // int [] studentname = new int [Numstudent]; // declare an array
            String [] studentname = new String [Numstudent]; // delare the string array
            
            Scanner myScanner = new Scanner( System.in ); // declare scanner
            System.out.println("Enter " + Numstudent + " student name is: "); // prompt the user to enter student names 
            
            
            int i=0;
            for(i=0; i<Numstudent; i++){
            
            
            studentname[i] = myScanner.next(); // import the scanner with input names
            }
           
            
            int gradenumber =-1; // generate random number for the grade
            int [] grade = new int [Numstudent]; // declare the array for the grade
            
            int k=0;
            for (k=0; k<Numstudent; k++){
                gradenumber = (int) (Math.random()*100);
                grade[k] = gradenumber;
                System.out.println("" + studentname[k] + " has grade " + grade[k]); // pring the name for the student
            
            }
            
            
            



}
}
            
            
            