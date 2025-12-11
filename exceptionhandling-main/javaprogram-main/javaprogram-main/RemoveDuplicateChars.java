package javaprogram;
import java.util.*;
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicate characters: " + result.toString());
	}

}