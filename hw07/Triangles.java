// Yuxin Wu (Cedric), Mar 4th '16
// homework 7, Print triangle of numbers

import java.util.Scanner; // import java scanner

public class Triangles{
                // main method required for every Java program
               public static void main(String[] args) {
              
Scanner myScanner = new Scanner( System.in ); // declare

System.out.print("Enter an integer between 5 and 30: "); // prompt user to enter the integers


myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Invalid number, input again: "); // prompt new input
}

int numInt = myScanner.nextInt(); // store that integer value


if (numInt <5 || numInt >30){
System.out.print("Invalid number, input again: "); // prompt input if it is less than 9 or more than 30
numInt = myScanner.nextInt();  // store value
}

int t = numInt;

for (int i=0; i<=numInt; i++){
    for(int j=1; j<=i; j++){
    System.out.print(" " + j);
    
    }
    t=t-i;
    System.out.println(" ");
}

for (int k=0; k<=numInt; k++){
    for(int z=k; z>0; z--){
    System.out.print(" " + z);
    
    }
    t=t-k;
    System.out.println(" ");
}

}}