package javaProject;

import java.util.Scanner;
public class Floating {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating number: ");
        double input1 = in.nextDouble();
        System.out.print("Input floating another number: ");
        double input2 = in.nextDouble();

        input1 = Math.round(input1 * 1000);
        input1 = input1 / 1000;

        input2 = Math.round(input2 * 1000);
        input2 = input2 / 1000;

        if (input1 == input2)
        {
            System.out.println("They are the same  decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}