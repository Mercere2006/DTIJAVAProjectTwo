package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;


public class AreaProject01 {
    public static void main(String[] args) {
    int choice;
    double base, widths, high, longs, radius, square, triangle, circle ;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("    Shape Area Program  ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Select menu: ");
        choice = sc.nextInt();

        if (choice == 1){
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Input widths: ");
            widths = sc.nextDouble();
            System.out.print("Input longs: ");
            longs = sc.nextLong();
            square = widths * longs;
            System.out.println("Area of Square is : " + df.format(square));
        }else if (choice == 2 ){
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Input bases: ");
            base = sc.nextDouble();
            System.out.print("Input high: ");
            high = sc.nextDouble();
            triangle = base * high / 2;
            System.out.println("Area of Triangle is : " + df.format(triangle));
        }else if (choice == 3){
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Input radius: ");
            radius = sc.nextDouble();
            circle = 3.14 * radius * radius;
            System.out.println("Area of Circle is : " + df.format(circle));
        }else{
            System.out.println("Thank you bye bye");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
