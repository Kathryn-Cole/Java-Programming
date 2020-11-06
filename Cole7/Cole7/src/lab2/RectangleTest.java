/*
 * Author: Kathryn Cole
 * Date: 11/11/2019
 * inputting numbers and outputting results for our rectangles
 */
package lab2;


public class RectangleTest {
    public static void main(String[]args){
        //Creating our rectangles and setting values
        Rectangle rectangle1 = new Rectangle(4.0, 40.0);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        
        //outputting and formatting results
        System.out.printf("Area of Rectangle 1: %1.2f", rectangle1.getArea());
        System.out.printf("\nPerimeter of Rectangle 1: %1.2f", rectangle1.getPerimetter());
        System.out.printf("\nArea of Rectangle 2: %1.2f", rectangle2.getArea());
        System.out.printf("\nPerimeter of Rectangle 2: %1.2f", rectangle2.getPerimetter());
        System.out.print("\n");
    }
}
