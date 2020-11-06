/*
 * Author: Kathryn Cole
 * Date: 11/11/2019
 * Creating class to handle flights and how many flights there are.
 */
package lab2;

public class Flight {
    //Declaring Variables
    private String airlineName;
    private String flightNum;
    private String airlineOrigin;
    private String airlineDest;
    static int count = 0;
    
    public Flight(){ // No Argument Constructor to set defaullt values
        this.airlineName = "None";
        this.flightNum = "0000";
        this.airlineOrigin = "Nowhere";
        this.airlineDest = "Nowhere";
        this.count++; //+1 for every time this constructor is used
    }
    public Flight(String airlineName, String flightNum, String airlineOrigin, String airlineDest){ //Constuctor allows for editing
        this.airlineName = airlineName;
        this.flightNum = flightNum;
        this.airlineOrigin = airlineOrigin;
        this.airlineDest = airlineDest;
        this.count++; //+1 for every time this constructor is used
    }

    //Getter Methods
    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getAirlineOrigin() {
        return airlineOrigin;
    }

    public String getAirlineDest() {
        return airlineDest;
    }
    
    public int getCount() {
        return count;
    }

    //Setter Methods
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setAirlineOrigin(String airlineOrigin) {
        this.airlineOrigin = airlineOrigin;
    }

    public void setAirlineDest(String airlineDest) {
        this.airlineDest = airlineDest;
    }
    
    public void setCount(int count){
        this.count = count;
    }
    
    //toString Method to allow us to easily output results
    @Override
    public String toString(){
        return airlineName+" "+flightNum+": "+airlineOrigin+" -> "+airlineDest;
    }
    //Counter to keep track of flights 
    public static void Counter(int count){
            count++;
    }
}
