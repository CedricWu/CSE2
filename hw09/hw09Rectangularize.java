// Yuxin WU, Mar. 25th
// hw 9, print formated words and % symbol


import java.util.Scanner; // import java scanner

public class hw09Rectangularize{
    
    



// public static void String (){
//     Scanner myScanner = new Scanner( System.in ); // declare
//     System.out.print("Enter a word: "); // prompt user to enter a word
    
//     String wordchar=myScanner.next();
//     int charnumber = wordchar.length();
//     System.out.println(""+charnumber);
// }

public static void main(String[] args) {


Scanner myScanner = new Scanner( System.in ); // declare
System.out.println("Enter a word: "); // prompt user to enter a word


String wordchar=myScanner.next();
    int charnumber = wordchar.length();
    



int i = 1;
while (i<=charnumber){
    System.out.println(" "+wordchar);
    i++;
}

System.out.println("Enter a number: "); // prompt user to enter a number
int inputnum=myScanner.nextInt();

int k=0;

while (k < inputnum){
    
    
    int j=1;
    while (j<=inputnum){
        System.out.print("%");
    j++;
    }
    System.out.println("");
    k++;
}





}}