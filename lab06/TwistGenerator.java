// Yuxin Wu (Cedric), Mar 4th, Lab 6
// The program is to ask for integer input for twist length 
// Print the twist with the length entered


import java.util.Scanner;  // import scanner

public class TwistGenerator{
                // main method required for every Java program
               public static void main(String[] args) {
                   
                   Scanner myScanner = new Scanner( System.in );  //import value
System.out.print("Enter an integer for the desired twist called Length: ");  // prompt value


myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter an integer: "); // prompt new input
}
int Length = myScanner.nextInt(); // store that integer value

while (Length <= 0){ // check if it's positive

System.out.print("Enter an positive integer: "); // prompt input if it isn't positive
Length = myScanner.nextInt();  // store value
}

 
int counter = 0;  // define counter to iterate

while (counter < Length){ // compare counter with lenght for the first line

    

    System.out.print("\\");  //print first symbol
    System.out.print(" ");  //print second symbol

    System.out.print("/");  // print the next symbol
    
    counter ++;  // iterate counter
  
}
 System.out.println(); // set a new line
 
int counter1 = 0; // define counter to iterate


while (counter1 < Length){
    // compare counter with lenght for the first line

    System.out.print(" "); //print first symbol

    System.out.print("X");//print second symbol

    System.out.print(" ");//print next symbol
    
    counter1 ++;
    
    
    
}
    System.out.println(); // set a new line
    

int counter2=0;// define counter to iterate

while (counter2 < Length) {


    System.out.print("/"); //print first symbol

    System.out.print(" ");//print 2nd symbol

    System.out.print("\\");//print next symbol
    
    counter2 ++;
    
}
System.out.println();// set a new line





}}