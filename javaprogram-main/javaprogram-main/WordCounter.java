package javaprogram;
import java.util.*;
public class WordCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = sc.nextLine();

        line = line.trim();
        if (line.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = line.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
	}

}