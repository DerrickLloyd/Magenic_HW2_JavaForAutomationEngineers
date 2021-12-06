import java.util.Scanner;

import static java.lang.Math.sqrt;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {
    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    /**
     * The base of the triangle
     */
    private double base;

    /**
     * Gets the base
     * @return The base
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the base
     * @param base The base of a triangle
     */
    public void setBase(double base) {
        if(base > 0)
            this.base = base;
    }

    /**
     * Calculates the area of the triangle object
     * @return The area of the triangle
     */
    public double area() {
        double height = sqrt(3) * base / 2;
        return (base * height)/2;
    }

    /**
     * Calculates the perimeter of the triangle object
     * @return The perimeter of the square
     */
    public double perimeter() {
        return 3 * base;
    }

    /**
     * The main method for the Triangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        EquilateralTriangle t = new EquilateralTriangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length:");
        int base = Integer.parseInt(scanner.nextLine());

        t.setBase(base);

        System.out.println("A triangle with side length of " + t.getBase() +  " has an area of: " + t.area());
        System.out.println("A triangle with side length of " + t.getBase() + " has a perimeter of: " + t.perimeter());
    }

}