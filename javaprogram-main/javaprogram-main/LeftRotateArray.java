package javaprogram;
import java.util.*;
public class LeftRotateArray {

	
		public static void leftRotate(int[] arr, int d) {
	        int n = arr.length;
	        d = d % n; // handle d > n
	        if (d == 0) return;

	        int[] temp = new int[n];
	        int k = 0;

	        for (int i = d; i < n; i++) {
	            temp[k++] = arr[i];
	        }
	        for (int i = 0; i < d; i++) {
	            temp[k++] = arr[i];
	        }

	        System.arraycopy(temp, 0, arr, 0, n);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Rotate left by how many positions? ");
	        int d = sc.nextInt();

	        leftRotate(arr, d);

	        System.out.println("Array after left rotation:");
	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
		
	}

}