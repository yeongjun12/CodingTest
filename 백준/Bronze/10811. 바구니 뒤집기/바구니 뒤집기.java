import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<count; i++) {
			int num1 = sc.nextInt() - 1;
			int num2 = sc.nextInt() - 1;
			
			while(num1<num2) {
				int temp = arr[num1];
				arr[num1++] = arr[num2];
				arr[num2--] = temp;
			}
		}
		
		for(int num : arr) System.out.print(num+" ");
		
		
		sc.close();
		
		
	}

	
}
