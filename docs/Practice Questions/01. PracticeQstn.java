/*Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        float rad = sc.nextFloat();
        double area = 3.14 * rad * rad;
        System.out.print("Area of the circle is: "+area+", when the radius is: "+rad);
    }
}
