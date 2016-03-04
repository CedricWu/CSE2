// Yuxin Wu (Cedric), Mar 4th '16
// homework 6, print Fibonacci number

import java.util.Scanner; // import java scanner

public class Fibonacci{
                // main method required for every Java program
               public static void main(String[] args) {
              
Scanner myScanner = new Scanner( System.in ); // declare




System.out.print("Enter first integer: "); // prompt user to enter the first integers
myScanner.hasNextInt(); //check booleen if it's true of a integer
while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter the first integer: "); // prompt new input
}
int Integ1 = myScanner.nextInt(); // store that integer value

while (Integ1 <= 0){ // check if it's positive

System.out.print("Enter a positive first integer: "); // prompt input if it isn't positive
Integ1 = myScanner.nextInt();  // store value
}







System.out.print("Enter second integer: "); // prompt user to enter the second integers
myScanner.hasNextInt(); //check booleen if it's true of a integer
while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage2 = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter the second integer: "); // prompt new input
}
int Integ2 = myScanner.nextInt(); // store that integer value

while (Integ2 <= 0){ // check if it's positive

System.out.print("Enter a positive second integer: "); // prompt input if it isn't positive
Integ2 = myScanner.nextInt();  // store value
}









System.out.print("Enter third integer: "); // prompt user to enter the third integers
myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage3 = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter the first integer: "); // prompt new input
}
int Integ3 = myScanner.nextInt(); // store that integer value

while (Integ3 <= 0){ // check if it's positive

System.out.print("Enter a positive first integer: "); // prompt input if it isn't positive
Integ3 = myScanner.nextInt();  // store value
}


System.out.print(Integ1 + ", " + Integ2);
 
 
    int counter = 3;


      
 int   a1 = Integ1; 
 int   a2 = Integ2;
 int   a3=a1+a2;
 System.out.print(", " + a3);
  
  
  while (counter < Integ3){   
     a1=a2;
     a2=a3;
     a3=a1+a2;
       System.out.print(", " +  a3);
  
    counter ++;
    
}

System.out.println();






}
    
}
    
