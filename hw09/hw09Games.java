// Yuxin WU, Mar. 25th
// hw 9, run the 3 games

import java.util.Random; //import a random number
import java.util.Scanner; // import java scanner

public class hw09Games{
        public static int prize () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(3); //store the random number
            int prize=randomInt+1;
            return prize;
        }
        
        public static String spincolor () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(2); //store the random number
            String spincolor="";
            switch(randomInt){
                case 0:
                spincolor="red";
                case 1:
                spincolor="black";
            }
        
            return spincolor;
        }
        
        public static int spinnumber () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(5); //store the random number
            int spinnumber=randomInt+1;
            return spinnumber;
        }
        
        
        
        
        
        
        
        
        
        public static void main(String[] args) {
              
Scanner myScanner = new Scanner( System.in ); // declare


// For box prize

System.out.print("Enter an integer from 1 to 3: "); // prompt user to enter the first integers
myScanner.hasNextInt(); //check booleen if it's true of a integer
while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter the first integer: "); // prompt new input
}
int Integ1 = myScanner.nextInt(); // store that integer value

while (Integ1 < 1 || Integ1 > 3){ // check if it's positive

System.out.print("Enter an integer from 1 to 3: "); // prompt input if it isn't positive
Integ1 = myScanner.nextInt();  // store value
}

int Prizegenerated=prize();

if (Integ1 == Prizegenerated){
    System.out.println("Congratulations, you won a prize of a million");
}
else{
    System.out.println("Try again for a prize");
}



// for spinner game
System.out.print("Enter color red or black: "); // prompt user to enter the first integers
System.out.println("Enter an integer from 1 to 5: "); // prompt user to enter the first integers
myScanner.hasNextInt(); //check booleen if it's true of a integer

while (myScanner.hasNextInt() == false){  // when it isn't an integer, prompt input again
    
    String garbage = myScanner.next(); //store the original value that wasn't an integer
    System.out.print("Enter an integer from 1 to 5: "); // prompt new input
}
int Integ2 = myScanner.nextInt(); // store that integer value


String inputcolor= myScanner.next();

while (inputcolor.equals("red") || inputcolor.equals("black")){ // check if it's red or black

System.out.print("Enter red or black "); // prompt input if it isn't positive
inputcolor = myScanner.next();  // store value
}




String spin = spincolor() + "" +spinnumber();
String inputspin = inputcolor + "" +Integ2;

if (spin == inputspin){
    System.out.println("Congratulations, you won a prize of a million");
}
else{
    System.out.println("Try again for a prize");
}


// For scramble game

// System.out.print("Enter a word: "); // prompt user to enter a word

// char word= myScanner.nextChar[];

// int i=1;
// char [] inputword = word;
// int j=Integ2;
// while (i<9){ // 

// inputword[inputword.length-1] = inputword[i];
// i++;
// }

// System.out.println(""+inputword);















}
}
           