package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pounds, feet, inches;
        double heightMeters, mass, BMI;

        //scanner gets the weight in pounds from the user
        System.out.println("Please enter your weight in pounds: ");
        pounds = input.nextInt();

        //get the height in feet from the user and then get the additional inches, this works because the default delimiter for the Scanner class is a space
        //the scanner will read the first int then read the space and know that anything after it should also be included
        System.out.println("Please enter your height in feet " + "followed by a space " + "then inches.");
        feet = input.nextInt();
        inches = input.nextInt();

        //convert height and weight into height in meters and mass
        heightMeters = ((feet * 12) + inches) * 0.0254;
        mass = pounds/2.2;

        //we will create a new Decimal format object so that we can round our BMI to two decimal places
        DecimalFormat two = new DecimalFormat(".00");

        //calculate BMI and return to user
        BMI = mass / (Math.pow(heightMeters, 2));

        //print our formatted BMI to the user and then let them know the category they are in
        System.out.println("Your BMI is " + two.format(BMI) + " Which means you fall under this category: ");

        //now see what category the BMI falls under and return it to the user
        if(BMI < 18.5){
            System.out.println("underweight");
        }else if(BMI<25){
            System.out.println("Normal weight");
        }else if(BMI < 30){
            System.out.println("overweight");
        }else{
            System.out.println("OBESE");
        }


    }
}
