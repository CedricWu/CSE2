// Yuxin Wu (Cedric), Feb 6th '16, hw 2, Arithmetic Calculation
//
public class Arithmetic {
        // main method required for every Java program
       public static void main(String[] args) {
        // our input data
    //Number of pairs of pants
    int numPants = 3;
    //Cost per pair of pants
    double pantsPrice = 34.98;

    //Number of sweatshirts
    int numShirts = 2;
    //Cost per shirt
    double shirtPrice = 24.99;

    //Number of belts
    int numBelts = 1;
    //cost per box of envelopes
    double beltCost = 33.99;

    //the tax rate
    double paSalesTax = 0.06;

        double costPants, costShirts, costBelts, taxPants, taxShirts, taxBelts, TotalCost, TotalTax, TotalPaid; // assign variables for all required calculations
        
        costPants=numPants*pantsPrice;
        costShirts=numShirts*shirtPrice;
        costBelts=numBelts*beltCost;
        taxPants=costPants*paSalesTax;
        taxShirts=costShirts*paSalesTax;
        taxBelts=costBelts*paSalesTax;
        TotalCost=(costPants+costShirts+costBelts);
        TotalTax=(taxPants+taxShirts+taxBelts);
        TotalPaid=(TotalCost+TotalTax);
       
        
        // Print output values in the question
    
    System.out.println("total cost of pants was "+costPants+" dollars");
    System.out.println("total cost of shirts was "+costShirts+" dollars");
    System.out.println("total cost of belts was "+costBelts+" dollars");
    System.out.println("total tax of pants was "+taxPants+" dollars");
    System.out.println("total tax of shirts was "+taxShirts+" dollars");
    System.out.println("total tax of belts was "+taxBelts+" dollars");
    System.out.println("total cost of pants, shirts, belts was "+TotalCost+" dollars");
    System.out.println("total sales tax was "+TotalTax+" dollars");
    System.out.println("total amount of amoney spent was "+TotalPaid+" dollars");


    }  //end of main method   
} //end of class


