/*
 * Author: Kathryn Cole
 * Date: 11/11/2019
 * Outputting flights and how many flights there are currently
 */
package lab2;

public class FlightTest {
    public static void main(String[]args){
        //initializing flights
        Flight flight1 = new Flight();
        Flight flight2 = new Flight("UML","U234","Chicago","London");
        Flight flight3 = new Flight("Java","J817","Atlanta","Paris");
        
        //outputting flights
        System.out.println(flight1);
        System.out.println(flight2);
        System.out.println(flight3);
        
        //counter output
        System.out.println("\nFumber of Flights: "+Flight.count);
    }
}
