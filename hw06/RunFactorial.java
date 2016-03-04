// Yuxin Wu (Cedric), Mar 4th '16
// homework 6, calculate Factorial between 9 and 16 as input

import java.util.Scanner; // import java scanner

public class RunFactorial{
                // main method required for every Java program
               public static void main(String[] args) {
              
Scanner myScanner = new Scanner( System.in ); // declare

System.out.print("Enter integer: "); // prompt user to enter the first integers


myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Invalid number, input again: "); // prompt new input
}

int FactInt = myScanner.nextInt(); // store that integer value


if (FactInt <9 || FactInt >16){
System.out.print("Invalid number, input again: "); // prompt input if it is less than 9 or more than 16
FactInt = myScanner.nextInt();  // store value
}



System.out.println("FactInt " + FactInt); // new line


int counter = 3; // initialize counter as value of 3 because of the first two integers
int a = 1;
int a1= 2 ;
int a2=a1*a;


while (counter <= FactInt){   // while the counter is less that 3rd integer


a1=a2;
a2=counter*a1;

counter ++;

    
}

System.out.println(" " + a2); // new line






} // done main method
    
} // done class