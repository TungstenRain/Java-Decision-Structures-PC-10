package ch03pc10;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date 11/1/2017
 * purpose: Calculate fat grams
 */
public class Ch03PC10 {

    public static void main(String[] args) {
        //variables
        double calories, fatGrams, fatCalories, percentFat;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request information
        System.out.print("Please enter the number of calories: ");
        calories = keyboard.nextDouble();
        System.out.print("Please enter the fat grams: ");
        fatGrams = keyboard.nextDouble();
        
        //Calculations
        fatCalories = fatGrams * 9;
        percentFat = fatCalories / calories;
        
        //Display output
        System.out.println("The calories from fat is: " + fatCalories);
        System.out.printf("The percentage of calories from fat is: %.2f\n", (percentFat * 100));
        if (percentFat < .3)
            System.out.println("This product is low in fat.");
        
        
    }
    
}
