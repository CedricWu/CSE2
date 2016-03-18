// Yuxin Wu (Cedric), Mar 11th '16
// homework 6, print star bowtie

import java.util.Scanner; // import java scanner

public class Bowtie{
                // main method required for every Java program
               public static void main(String[] args) {
      
      
     
     
    //  while(1>0){
                   
     int nStars=9;
     
   
         int n = nStars;
         int t = n;
         int p = 3;
         for(int i = 0; i < (n + 1)/2; i++) {
             for(int z = 0; z <= 2*i; z++) {
                 System.out.print(" ");
             }
             for(int j = 0; j < t; j++) {
                 System.out.print("* ");
             }
             t = t - 2;
             System.out.println();
         }
         
         for(int k = 0; k < (n - 1)/2; k++) {
             for(int y = 0; y <= (n - p); y++) {
                 System.out.print(" ");
             }
             for(int m = 0; m < p; m++) {
                 System.out.print("* ");
             }
             p = p + 2;
             System.out.println();
         }
        
        
        System.out.println();
        
        nStars=15;
        n=nStars;
        t=n;
        p=3;
   
         for(int i = 0; i < (n + 1)/2; i++) {
             for(int z = 0; z <= 2*i; z++) {
                 System.out.print(" ");
             }
             for(int j = 0; j < t; j++) {
                 System.out.print("* ");
             }
             t = t - 2;
             System.out.println();
         }
         
         for(int k = 0; k < (n - 1)/2; k++) {
             for(int y = 0; y <= (n - p); y++) {
                 System.out.print(" ");
             }
             for(int m = 0; m < p; m++) {
                 System.out.print("* ");
             }
             p = p + 2;
             System.out.println();
         }  
     
         
         System.out.println();
                 
 
Scanner myScanner = new Scanner( System.in ); // declare

System.out.print("Enter integer between 3 & 33: "); // prompt user to enter the first integers


myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Invalid number, input again: "); // prompt new input
}

nStars = myScanner.nextInt(); // store that integer value


if (nStars <=3 || nStars >=33 || (nStars%2)!=1){
System.out.print("Invalid number, input again: "); // prompt input if it is less than 9 or more than 16
nStars = myScanner.nextInt();  // store value
} 
     
      
        n=nStars;
        t=n;
        p=3;
   
         for(int i = 0; i < (n + 1)/2; i++) {
             for(int z = 0; z <= 2*i; z++) {
                 System.out.print(" ");
             }
             for(int j = 0; j < t; j++) {
                 System.out.print("* ");
             }
             t = t - 2;
             System.out.println();
         }
         
         for(int k = 0; k < (n - 1)/2; k++) {
             for(int y = 0; y <= (n - p); y++) {
                 System.out.print(" ");
             }
             for(int m = 0; m < p; m++) {
                 System.out.print("* ");
             }
             p = p + 2;
             System.out.println();
         }     
       
       
       
    //   Scanner myScanner = new Scanner( System.in ); // import
    //   System.out.print("Enter anything: "); // prompt user to enter an input
    //   String Enter = myScanner.nextString();    //store the input 
    //   if(Enter.equals("Y")||Enter.equals("y"){
    //      break;
    //   }
       
    //  }       
       
                   
                   
                   
}}
              