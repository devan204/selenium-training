package javaprogram;
import java.util.*;
public class second_largest_smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer largest = null, secondLargest = null;
        Integer smallest = null, secondSmallest = null;

        for (int x : arr) {
           
            if (largest == null || x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x != largest && (secondLargest == null || x > secondLargest)) {
                secondLargest = x;
            }

            if (smallest == null || x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x != smallest && (secondSmallest == null || x < secondSmallest)) {
                secondSmallest = x;
            }
        }

        if (secondLargest == null || secondSmallest == null) {
            System.out.println("Second largest/smallest does not exist (not enough distinct values).");
        } else {
            //System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
            //System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
		
	}

}