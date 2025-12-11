package javaprogram;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }
	}

}