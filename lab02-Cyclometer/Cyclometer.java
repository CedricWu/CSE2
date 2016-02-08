// Yuxin Wu (Cedric), Feb 5th '16, Cyclometer Arithmatic Calculation

//
public class Cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {
        // our input data. 

           int secsTrip1=480;  // seconds taken for first trip
           int secsTrip2=3220;  // seconds taken for second trip
        int countsTrip1=1561;  // number of counts of first trip
        int countsTrip2=9037; // number of counts of second trip
        double wheelDiameter=27.0,  // the diameter of the wheel
      PI=3.14159, // constant of pi
      feetPerMile=5280,  // conversion between feet, Mile
      inchesPerFoot=12,   // conversion between inch, foot
      secondsPerMinute=60;  // conversion between second, minute
    double distanceTrip1, distanceTrip2,totalDistance;  // assign variables for the distance for the two trips, also the total distance
            System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts."); // Print time, counts of trip 1
           System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts."); // Print time, counts taken for trip 2
        //run the calculations; store the values. 
        // Calculating the distance for trip 1, 2, total
        //
    distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");


    }  //end of main method   
} //end of class
