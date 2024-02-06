// Practicum 14 (The Enhanced for Loop in Java)
// (TO COMPLETE)

// This program will add up all the integers in a given array.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nums[] = {5, 24, 36, 54, 65, 72};
     
        int sum = 0;

        for(int i : nums)
            sum = sum + nums[i];
        System.out.println("Sum = " + sum);

    }
}
