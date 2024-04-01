package org.launchcode;


import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?  ");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width?  ");
        int width = Integer.parseInt(input.nextLine());

        int area = 2*length + 2*width;
        System.out.println("The total area is:  " + area);
    }

}
