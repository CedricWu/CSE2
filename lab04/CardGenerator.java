// Yuxin Wu (Cedric), Feb 19th '16, Random Generator of Cards

// Generating a card randomly with printing suit, card identity
public class CardGenerator {
        // main method required for every Java program
       public static void main(String[] args) {
        // our input data. 
        
        
        int card = (int)(Math.random()*13)+1;
        String suitNA = "";
        String numberNA ="";
        
if (card <= 13){
    suitNA = "Diamond";
    
    // println( "You chose a Diamond" );
}

else if (card >13 && card <= 26){
    suitNA = "Club";
    // println( "You chose a Club" );
}

else if (card >26 && card <= 39){
    suitNA = "Heart";
    
    // println( "You chose a Heart" );
}

else if (card >39 && card <= 52){
    suitNA = "Blade";
    
    // println( "You chose a BLade" );
}

else 

    System.out.println( "Invalid number" );

 
if (card <= 13){  
switch (card){
    case 1:
    numberNA = "Ace";
    // chose an Ace
    break;
    case 2:
    numberNA = "Two";
    
    //System.out.println("You chose a Two");
    break;
    case 3:
    numberNA = "Three";
    //System.out.println("You chose a Three");
    break;
    
    case 4:
    numberNA = "Four";
    //System.out.println("You chose a Four");
    break;
    case 5:
        numberNA = "Five";
    //System.out.println("You chose a Five");
    break;
    
    case 6:
        numberNA = "Six";
    //System.out.println("You chose a Six");
    break;
    case 7:
        numberNA = "Seven";
    //System.out.println("You chose a Seven");
    break;
    case 8:
        numberNA = "Eight";
    //System.out.println("You chose a Eight");
    break;
    case 9:
        numberNA = "Nine";
    //System.out.println("You chose a Nine");
    break;
    case 10:
        numberNA = "Ten";
    //System.out.println("You chose a Ten");
    break;
    case 11:
        numberNA = "Jack";
    //System.out.println("You chose a Jack");
    break;
    case 12:
        numberNA = "Queen";
    //System.out.println("You chose a Queen");
    break;
    case 13:
        numberNA = "King";
    //System.out.println("You chose a King");
    break;
    

} }
 
 
  
else if (card > 13){  

 int identity =  card % 13;


switch (identity){
    case 1:
    numberNA = "Ace";
    // chose an Ace
    break;
    case 2:
    numberNA = "Two";
    
    //System.out.println("You chose a Two");
    break;
    case 3:
    numberNA = "Three";
    //System.out.println("You chose a Three");
    break;
    
    case 4:
    numberNA = "Four";
    //System.out.println("You chose a Four");
    break;
    case 5:
        numberNA = "Five";
    //System.out.println("You chose a Five");
    break;
    
    case 6:
        numberNA = "Six";
    //System.out.println("You chose a Six");
    break;
    case 7:
        numberNA = "Seven";
    //System.out.println("You chose a Seven");
    break;
    case 8:
        numberNA = "Eight";
    //System.out.println("You chose a Eight");
    break;
    case 9:
        numberNA = "Nine";
    //System.out.println("You chose a Nine");
    break;
    case 10:
        numberNA = "Ten";
    //System.out.println("You chose a Ten");
    break;
    case 11:
        numberNA = "Jack";
    //System.out.println("You chose a Jack");
    break;
    case 12:
        numberNA = "Queen";
    //System.out.println("You chose a Queen");
    break;
    case 13:
        numberNA = "King";
    //System.out.println("You chose a King");
    break;
    

} }

System.out.println( "You chose a "+ suitNA + " " + numberNA); 

}}

