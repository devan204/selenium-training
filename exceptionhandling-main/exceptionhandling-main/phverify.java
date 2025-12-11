package exceptionhandling;
import java.util.Scanner;


public class phverify {
	public static void main(String[] args) {
		String numpattern="^(\\d{3}|\\+\\d{1})-\\d{3}-\\d{3}-\\d{4}$";
		char check;
		
		do {
			System.out.println("enter number");
			Scanner sc=new Scanner(System.in);
			String ph=sc.nextLine();
			if(ph.matches(numpattern)) {
				System.out.println("Valid mobile number");
			}else {
				System.out.println("Invalid Number");
			}
			System.out.println("Do you want to continue y/n");
			check=sc.next().charAt(0);
		}while(check!='n');
	}
}