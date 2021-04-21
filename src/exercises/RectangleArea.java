package exercises;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Side A: ");
        float sideA = input.nextFloat();
        System.out.print("Enter Side B: ");
        float sideB = input.nextFloat();
        System.out.print("The area is: " + sideA * sideB);
    }
}
