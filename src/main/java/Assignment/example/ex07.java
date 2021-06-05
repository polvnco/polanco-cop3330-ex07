/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment.example;


import java.util.Scanner;

public class ex07
{
    public static void main( String[] args )
    {
        System.out.print( "What is the length of the room in feet? " );
        Scanner areaLength = new Scanner(System.in);
        String length = areaLength.nextLine();
        int x = Integer.parseInt(length);

        System.out.print( "What is the width of the room in feet? " );
        Scanner areaWidth = new Scanner(System.in);
        String width = areaWidth.nextLine();
        int y = Integer.parseInt(width);

        int area = x * y;
        final double formula = 0.09290304;
        double squareMeters = area * formula;


        System.out.println("You entered the dimensions of " + x + " feet by " + y + " feet.");
        System.out.println("The area is \n" + area + " square feet");
        System.out.println(squareMeters + " square meters");
    }
}
