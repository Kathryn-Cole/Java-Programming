/*
 * Author: Kathryn Cole
 * Date: 11/11/2019
 * Creating class to handle the math for our perimeter and area of a rectangle
 */
package lab2;

public class Rectangle {
    //variables to handle width and length
    private double width;
    private double length;
    
    //no argument constructor to set default
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    //constructor to allow for value adjustment
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    //getter methods
    public double getArea(){ //area
        return width*length;
    }
    public double getPerimetter(){ //perimeter
        return 2*(width*length);
    }
}
