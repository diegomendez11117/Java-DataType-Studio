package exercises;
import java.util.Scanner;
public class CarGas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles?");
        int miles = input.nextInt();
        System.out.print("How many gallons?");
        int gallons = input.nextInt();
        System.out.print("your car use: " + miles/gallons + " miles/gallon");
    }
}
