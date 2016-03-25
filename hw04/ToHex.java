// Yuxin Wu (Cedric), Feb 19th '16
// homework 4, converting decimals to hexadecimal for pixel colors

import java.util.Scanner; // import java scanner

public class ToHex{
                // main method required for every Java program
               public static void main(String[] args) {
              
Scanner myScanner = new Scanner( System.in ); // declare

System.out.print("Please enter three numbers representing RGB values: "); // prompt user to enter the decimal values     

int DECIMALS1 = myScanner.nextInt(); // assign DECIMALS1 to the first imported values
int DECIMALS2 = myScanner.nextInt(); // assign DECIMALS1 to the second imported values
int DECIMALS3 = myScanner.nextInt(); // assign DECIMALS1 to the third imported values

String Hexa11 = ""; // assign String Hexa 11 as the first location of Hexadecimal print
String Hexa12 = ""; // assign String Hexa 12 as the 2nd location of Hexadecimal print
String Hexa21 = ""; // assign String Hexa 21 as the 3rd location of Hexadecimal print
String Hexa22 = ""; // assign String Hexa 22 as the 4th location of Hexadecimal print
String Hexa31 = ""; // assign String Hexa 31 as the 5th location of Hexadecimal print
String Hexa32 = ""; // assign String Hexa 32 as the 6th location of Hexadecimal print


if (DECIMALS1 >= 0 && DECIMALS1 <= 255 &&
    DECIMALS2 >= 0 && DECIMALS2 <= 255 &&
    DECIMALS3 >= 0 && DECIMALS3 <= 255 ){   // condition on all input decimals are in the right range
    
    int RED1 = (DECIMALS1/16);   // calculate the quotient of the first decimal number/16, assign as RED1
    int GREEN1 = (DECIMALS2/16);  // calculate the quotient of the 2ND decimal number/16, assign as GREEN1
    int BLUE1 = (DECIMALS3/16);  // calculate the quotient of the 3RD decimal number/16, assign as BLUE1
    
    int RED2 = DECIMALS1 % 16;// calculate the reminder of the first decimal number/16, assign as RED2
    int GREEN2 = DECIMALS2 % 16;// calculate the reminder of the 2ND decimal number/16, assign as GREEN2
    int BLUE2 = DECIMALS3 % 16;// calculate the reminder of the 3RD decimal number/16, assign as BLUE2
    
   
       int Quotient1=(RED1-9); //subtract 9 from the quotient to give the value
        
        switch(Quotient1){
                case 1:            // if the value after subtraction is 1, then the original RED1 is 10, then it's A
                Hexa11="A";
                break;
                case 2:// if the value after subtraction is 2, then the original RED1 is 11, then it's B
                Hexa11="B";
                break;
                case 3:// if the value after subtraction is 3, then the original RED1 is 12, then it's C
                Hexa11="C";
                break;
                case 4:// if the value after subtraction is 4, then the original RED1 is 13, then it's D
                Hexa11="D";
                break;
                case 5:// if the value after subtraction is 5, then the original RED1 is 14, then it's E
                Hexa11="E";
                break;
                case 6:// if the value after subtraction is 6, then the original RED1 is 15, then it's F
                Hexa11="F";
                break;
                default:// if the value after subtraction is <0, then the original RED1 is 1 to 9, then it's just the number
                Hexa11=""+RED1;
                break;
            }
   
   int Quotient2=(GREEN1-9); //subtract 9 from the quotient to give the value
        
        switch(Quotient2){
            case 1:// if the value after subtraction is 1, then the original value is 10, then it's A
                Hexa21="A";
                break;
                case 2:// if the value after subtraction is 2, then the original value is 11, then it's B
                Hexa21="B";
                break;
                case 3:// if the value after subtraction is 3, then the original value is 12, then it's C
                Hexa21="C";
                break;
                case 4:// if the value after subtraction is 4, then the original value is 13, then it's D
                Hexa21="D";
                break;
                case 5:// if the value after subtraction is 5, then the original value is 14, then it's E
                Hexa21="E";
                break;
                case 6:// if the value after subtraction is 6, then the original value is 15, then it's F
                Hexa21="F";
                break;
                default:// if the value after subtraction is <0, then the original value is 1 to 9, then it's just the number
                Hexa21=""+GREEN1;
                break;
            }
   
   int Quotient3=(BLUE1-9);//subtract 9 from the quotient to give the value
        
        switch(Quotient3){
            case 1:// if the value after subtraction is 1, then the original value is 10, then it's A
                Hexa31="A";
                break;
                case 2:// if the value after subtraction is 2, then the original value is 11, then it's B
                Hexa31="B";
                break;
                case 3:// if the value after subtraction is 3, then the original value is 12, then it's C
                Hexa31="C";
                break;
                case 4:// if the value after subtraction is 4, then the original value is 13, then it's D
                Hexa31="D";
                break;
                case 5:// if the value after subtraction is 5, then the original value is 14, then it's E
                Hexa31="E";
                break;
                case 6:// if the value after subtraction is 6, then the original value is 15, then it's F
                Hexa31="F";
                break;
                default:// if the value after subtraction is <0, then the original value is 1 to 9, then it's just the number
                Hexa31=""+BLUE1;
                break;
            }
    
    int Reminder1=(RED2-9);
        
        switch(Reminder1){
            case 1:// if the value after subtraction is 1, then the original value is 10, then it's A
                Hexa12="A";
                break;
                case 2:// if the value after subtraction is 2, then the original value is 11, then it's B
                Hexa12="B";
                break;
                case 3:// if the value after subtraction is 3, then the original value is 12, then it's C
                Hexa12="C";
                break;
                case 4:// if the value after subtraction is 4, then the original value is 13, then it's D
                Hexa12="D";
                break;
                case 5:// if the value after subtraction is 5, then the original value is 14, then it's E
                Hexa12="E";
                break;
                case 6:// if the value after subtraction is 6, then the original value is 15, then it's F
                Hexa12="F";
                break;
                default:// if the value after subtraction is <0, then the original value is 1 to 9, then it's just the number
                Hexa12=""+RED2;
                break;
            }
   int Reminder2=(GREEN2-9);
        
        switch(Reminder2){
            case 1:// if the value after subtraction is 1, then the original value is 10, then it's A
                Hexa22="A";
                break;
                case 2:// if the value after subtraction is 2, then the original value is 11, then it's B
                Hexa22="B";
                break;
                case 3:// if the value after subtraction is 3, then the original value is 12, then it's C
                Hexa22="C";
                break;
                case 4:// if the value after subtraction is 4, then the original value is 13, then it's D
                Hexa22="D";
                break;
                case 5:// if the value after subtraction is 5, then the original value is 14, then it's E
                Hexa22="E";
                break;
                case 6:// if the value after subtraction is 6, then the original value is 15, then it's F
                Hexa22="F";
                break;
                default:// if the value after subtraction is <0, then the original value is 1 to 9, then it's just the number
                Hexa22=""+GREEN2;
                break;
            }
    int Reminder3=(BLUE2-9);
        
        switch(Reminder3){
            case 1:// if the value after subtraction is 1, then the original value is 10, then it's A
                Hexa32="A";
                break;
                case 2:// if the value after subtraction is 2, then the original value is 11, then it's B
                Hexa32="B";
                break;
                case 3:// if the value after subtraction is 3, then the original value is 12, then it's C
                Hexa32="C";
                break;
                case 4:// if the value after subtraction is 4, then the original value is 13, then it's D
                Hexa32="D";
                break;
                case 5:// if the value after subtraction is 5, then the original value is 14, then it's E
                Hexa32="E";
                break;
                case 6:// if the value after subtraction is 6, then the original value is 15, then it's F
                Hexa32="F";
                break;
                default:// if the value after subtraction is <0, then the original value is 1 to 9, then it's just the number
                Hexa32=""+BLUE2;
                break;
            }
   
   
    }
    
else if (DECIMALS1 <= 0 || DECIMALS1 >= 255 ||
         DECIMALS2 <= 0 || DECIMALS2 >= 255 ||
         DECIMALS3 <= 0 || DECIMALS3 >= 255 ) {
System.out.println( "Your input should be from 0 to 255" ); }  // if the decimal values entered are less than 0, or more than 255, then print this line to prompt new values
        
else
System.out.println( "Your input should be an integer" ); // otherwise prompt the user to enter integers


System.out.println( "The decimal numbers R:" + DECIMALS1 + "  G:" + DECIMALS2 + "  B:" + DECIMALS3 + "," + "is represented in hexadecimal as: " + Hexa11 + Hexa12 + Hexa21 + Hexa22 + Hexa31 + Hexa32); // print the hexadecimals

}}