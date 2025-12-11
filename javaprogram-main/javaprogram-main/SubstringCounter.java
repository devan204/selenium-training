package javaprogram;
import java.util.*;
public class SubstringCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();

        if (sub.isEmpty()) {
            System.out.println("Substring is empty. Occurrences: 0");
            return;
        }

        int count = 0;
        int index = 0;

        while (true) {
            index = str.indexOf(sub, index);
            if (index == -1) break;
            count++;
            index = index + 1; 
        }

        System.out.println("Occurrences of \"" + sub + "\": " + count);
	}

}