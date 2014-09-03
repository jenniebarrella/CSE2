// Jennie-rose Barrella
// September 3, 2014
// CSE 002
// records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time.
// This program will
// print the number of minutes for each trip
// print the number of counts for each tirp
// print the distance of each trip in miles
// print the distance for the two trips combined
//
public class Cyclometer {
    // main method required by every java program
    public static void main(String[] args)  {
        //
        // our input data
        int secsTrip1=480;     // number of seconds trip 1
       	int secsTrip2=3220;    // number of seconds trip 2
		int countsTrip1=1561;  // number of rotations trip 1
		int countsTrip2=9037;  // number of rotations trip 2
		//
		// our intermediate variables and output data
		double wheelDiameter=27.0,  // constant
  	    PI=3.14159,  // constant
  	    feetPerMile=5280,  // constant
    	inchesPerFoot=12,   // constant
  	    secondsPerMinute=60;  // constant
  	    double distanceTrip1=0,distanceTrip2=0,totalDistance=0; // output data
    	//
    	// print numbers stored
    	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	//
       	//run the calculations; store the values
       	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	// for each count, a rotation of the wheel travels the diameter in inches times PI
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2; // total distance
	    //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");

    }  //end of main method
}  // end of class
