package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();

        System.out.print("The area is: " + Circle.getArea(radius));
    }
}
