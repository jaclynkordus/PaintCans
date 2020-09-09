package paintcansfinalproject;

/**
 * @author Jaclyn Kordus CSCI-180-01 at 9 am MWF
 *
 * This program takes in one input of the length of one pyramid side. Then it
 * calculates the area of the sides of the pyramid that are used, and the number
 * of coats needed. Using that information, it then uses the total area to
 * calculate how many paint and primer cans are needed.
 */
import java.util.Scanner;

public class PaintCansFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("This program will calculate the number of cans of \n"
                + "primer and special reflective paint that are needed \n"
                + "for a double equilateral pyramid prism monument.\n ");

        //connect keyboard
        Scanner keyboard = new Scanner(System.in);

        double pyramidLength = 0;

        while (pyramidLength > -1) {

            System.out.println("Enter the length of one of the pyramid sides in feet such as 12.5 or enter -1 to quit: ");
            pyramidLength = keyboard.nextDouble();

            if (pyramidLength < 0) {
                break;
            }

            //calculate area of one pyramid side
            double pyramidArea = ((Math.sqrt(3)) / 4) * (pyramidLength * pyramidLength);

            //pyramid has 8 sides that needs primer
            double sidesForPrimer = 8.0;

            // pyramid has 7 sides that need 2 coats of paint
            double sidesForReflectivePaint = 14.0;

            //calculate the area of the amount of sides of the pyramid used and coats needed
            double areaPrimer = (pyramidArea * sidesForPrimer);
            double areaReflectivePaint = (pyramidArea * sidesForReflectivePaint);

            //1 can of paint covers 5 sq ft
            final int coverage = (5);

            //calculte how many cans of primer is needed
            double primerCans = Math.ceil((areaPrimer / coverage));
            //calcuate how many cans of reflective paint is needed
            double reflectivePaint = Math.ceil((areaReflectivePaint / coverage));

            System.out.println("The number of primer paint cans needed is: " + primerCans);

            System.out.println("The number of reflective paint cans needed is: " + reflectivePaint);

        } //ends while

    }

}
