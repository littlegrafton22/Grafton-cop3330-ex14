/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_14 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        //Here first we take all the inputs

        System.out.print("What is the order amount ? ");
        double amount = Double.parseDouble(obj.nextLine());

        System.out.print("What is the state ? ");
        String state = obj.nextLine();

        System.out.print("The subtotal is $"+amount);

        //Now if the state is WI then we print the tax and new total

        if (state.equalsIgnoreCase("wi")) {

            //calculating tax
            double tax = amount * 0.055;
            System.out.print("\nThe Tax is $"+ tax);

            //new amount will contain the tax
            amount = amount + tax;
            System.out.print("\nThe total is $"+ amount);
        }

    }

}