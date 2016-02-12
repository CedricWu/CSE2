// Yuxin Wu (Cedric), Feb 11th, HW 3 part 2
// Calculate the volume of a pyramid with given dimensions


import java.util.Scanner; // import java scanner

public class Pyramid{
                // main method required for every Java program
               public static void main(String[] args) {
                   
                   Scanner myScanner = new Scanner( System.in ); // declare
System.out.print("The square side of the pyramid is: ");  // prompt user to enter the side length of square

double squareLength = myScanner.nextDouble();  //assign squareLength as the side length of square

System.out.print("The height of the pyramid is: ");  // prompt user to enter the height
double height = myScanner.nextDouble(); // conversion rate from 1 meter to inches

double Volume; // assign Volume as the volume of the pyramid with given dimensions


Volume = (squareLength * squareLength * height)/3; // Calculate the volume

System.out.println(" The volume inside the pyramid is " + Volume); //print the Volume of pyramid


}  //end of main method   
      } //end of class
