/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sel, from_type,to_type;
        String holder;
        double init_temp;
        System.out.println("Press C to convert from Fahrenheit to Celsius\n" +
                "Press F to convert from Celsius to Fahrenheit");
        //Receive input but only allow for 'C','c','F', or 'f' using a while true loop
        while (true) {
            System.out.print("Your choice: ");
            Sel = input.nextLine();
            if (Sel.equals("C") || Sel.equals("c") || Sel.equals("F") || Sel.equals("f"))
                break;
            else {
                System.out.println("Invalid Input, Try again...");
                continue;
            }
        }
        if (Sel.equals("C") || Sel.equals("c")) {
            from_type = "Fahrenheit";
            to_type = "Celsius";
        }else {
            from_type = "Celsius";
            to_type = "Fahrenheit";
        }
        while (true) {
            try {
                System.out.format("Please enter your temperature in %s: ", from_type);
                holder = input.nextLine();
                init_temp = Integer.parseInt(holder);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        System.out.format("The temperature in %s is %.1f", to_type,conversion(init_temp,from_type));
    }

    public static double conversion(double in, String from){
        if (from.equals("Fahrenheit"))
            return (in - 32) * 5 / 9;
        else
            return (in * 9 / 5) + 32;
    }
}
