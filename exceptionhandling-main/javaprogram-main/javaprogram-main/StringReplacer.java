package javaprogram;
import java.util.*;
public class StringReplacer {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter original string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter substring to replace: ");
	        String oldSub = sc.nextLine();

	        System.out.print("Enter new substring: ");
	        String newSub = sc.nextLine();

	        String result = str.replace(oldSub, newSub);

	        System.out.println("Resulting string: " + result);
	}

}