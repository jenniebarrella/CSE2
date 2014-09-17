// Jennie-rose Barrella
// Spetember 10, 2014
// CSE02
// hw03
// enter the number of seconds and number of counts
// print distance traveled and average miles per hous
import java.util.Scanner;
public class Bicycle {
    // main method
    public static void main(String[] args) {
        // constants
        double wheelDiameter=27, 
        pi=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
  	    secondsPerMinute=60,
  	    minutesPerHour=60;
  	    // declare variables
  	    double distanceInSeconds=0;
  	    double distance=0;
  	    double minutes=0;
  	    double avgMilePerHour=0;
  	    // input data
        Scanner scan = new Scanner(System.in);
        int counts;
        int seconds;
        System.out.println("enter the number of counts");
        counts = scan.nextInt();
        System.out.println("enter the number of seconds");
        seconds = scan.nextInt();
        // calculations
        distanceInSeconds=counts*wheelDiameter*pi;  // distance in seconds
        distance=distanceInSeconds/(inchesPerFoot*feetPerMile);  // distance in miles
        minutes=seconds/secondsPerMinute;
        avgMilePerHour=distance/(minutes/minutesPerHour); 
        // restrict decimal places
        double distance100=(int)(distance*100);
        double distanceFinal=(distance100/100);
        double avgMilePerHour100=(int)(avgMilePerHour*100);
        double avgMilePerHourFinal=(avgMilePerHour100/100);
        // print results
        System.out.println("the distance was "+distanceFinal+" miles and took "+minutes+ " minutes");
        System.out.println("the average MPH was "+avgMilePerHourFinal);
        
    }
}