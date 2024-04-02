package org.launchcode;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the radius?  ");
        double radius = Double.parseDouble(input.nextLine());
        double areaOfCircle = Circle.getArea(radius);

        if (radius < 0 || Double.isNaN(radius)) {
            System.out.println("Input is incorrect");
        } else {
            System.out.println("The area of a circle with a radius of " + radius + " = " + areaOfCircle);
        }
    }
}




