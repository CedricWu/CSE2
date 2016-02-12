// Yuxin Wu (Cedric), Feb 11th, HW 3
// Convert meters to inches


import java.util.Scanner; // import java scanner

public class Convert{
                // main method required for every Java program
               public static void main(String[] args) {
                   
                   Scanner myScanner = new Scanner( System.in ); // declare
System.out.print("Enter the distance in meters (in the form xx.xx): ");  // prompt user to enter the number of meters

double distMeter = myScanner.nextDouble();  //assign distMeter as the distance in meters
double conversion=39.3701; // conversion rate from 1 meter to inches

double distInch; // assign distInch as distance in inches


distInch = distMeter * conversion; // convert meters to inches

System.out.println(" " + distMeter + "   is   " + distInch + "    inches"); //print the converted distance in inches


}  //end of main method   
      } //end of class
