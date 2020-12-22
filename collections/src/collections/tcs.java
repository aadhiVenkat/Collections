package collections;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class tcs {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // to store input values
        ArrayList<Double> numbers = new ArrayList<Double>();
        double d = 42.195; // particular distance is given in program
        double nextnum = 0.0;
        String userinput = "0.0";
        boolean temp = true;
        System.out.println("Enter the distances covered individual values");
        while (true) {
            try {
                // user input can be stored in string
                userinput = input.nextLine();
                // the string userinput converting double number
                nextnum = Double.parseDouble(userinput);
                // to check given number lessthan equal to distance and greaterthan 0.0
                if (nextnum <= d && nextnum > 0.0) {
                    if (nextnum< d) // to check given number lessthan distance
                        numbers.add(nextnum); // add number into numbers ArrayList
                }
                else
                    temp = false; // if any negative value presented in user input to store this value
            }
            catch (NumberFormatException e) {
                break; // to break user input given q and exit
            }
        }
        System.out.println("Highest Distance Excluding Finishers");
        if (temp) {
            // first sort done the asscending order then it
            // will do descending order
            Collections.sort(numbers,Collections.reverseOrder());
            // to store first 3 values in list
            List<Double> values = numbers.subList(0, 3);
            System.out.println(values); // print List
        }
        else
            System.out.println("Invalid Input!");
    }
}
