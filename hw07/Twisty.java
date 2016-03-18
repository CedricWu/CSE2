// Yuxin Wu (Cedric), Mar 4th '16
// homework 7, Twist printing

import java.util.Scanner; // import java scanner



public class Twisty{
                // main method required for every Java program
               public static void main(String[] args) {
      
Scanner myScanner = new Scanner( System.in ); // declare

System.out.print("Enter length: "); // prompt user to enter the integers
System.out.print("Enter width: "); // prompt user to enter the integers

myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Invalid number, input again: "); // prompt new input
}

int Length = myScanner.nextInt(); // store that length value
System.out.println();
int Width = myScanner.nextInt(); // store that length value

if (Length > 80 || Width > Length){
System.out.print("Invalid number, input again: "); // prompt input if it is less than 9 or more than 30
Length = myScanner.nextInt();  // store value
Width = myScanner.nextInt();
}
     
   
         int n = Length;
         int w = Width;
         int t = n;
         int p = 3;
         for(int i = 0; i < (n + 1)/2; i++) {
             for(int z = 0; z <= 2*i; z++) {
                 System.out.print("  ");
             }
             for(int j = 0; j < t; j++) {
                 System.out.print("#");
             }
             t = t - 2;
             System.out.println();
         }
         
         for(int k = 0; k < (n - 1)/2; k++) {
             for(int y = 0; y <= (n - p); y++) {
                 System.out.print("  ");
             }
             for(int m = 0; m < p; m++) {
                 System.out.print("/ ");
             }
             p = p + 2;
             System.out.println();
         }
        
        
        System.out.println();
        
       
         }
}