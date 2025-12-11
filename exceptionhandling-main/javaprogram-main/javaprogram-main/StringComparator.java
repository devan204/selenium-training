package javaprogram;
import java.util.*;
public class StringComparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        
        if (s1.equals(s2)) {
            System.out.println("Strings are equal (equals).");
        } else {
            System.out.println("Strings are NOT equal (equals).");
        }

      
        int result = s1.compareTo(s2);
        if (result == 0) {
            System.out.println("compareTo: Both strings are equal.");
        } else if (result < 0) {
            System.out.println("compareTo: First string is lexicographically smaller.");
        } else {
            System.out.println("compareTo: First string is lexicographically greater.");
        }
	}

}