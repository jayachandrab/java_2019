package msit.m2;
// Aughor jayachandra

public class AreaOfCircle {
    
    private static final double PI = 3.14159;

    /**
     * This method calculates the area of the circle.
     * Use the PI variable defined in the line number 8.
     * 
     * @param radius, the radius of the circle
     * @return the area of the circle
     */
    public static double areaOfCircle(double radius) {
        //  Your code goes here....
        return PI*radius*radius;

    }

    /**
     * This method returns the perimiter of the circle.
     * Use the PI variable defined in the line number 8.
     * 
     * @param radius, the radius of the circle.
     * @return the perimeter of the circle.
     */
    public static double perimeterOfCircle(double radius) {
        //  Your code goes here....
        return 2 * PI * radius;

    }
}