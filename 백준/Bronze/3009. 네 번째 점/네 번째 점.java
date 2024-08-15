
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int[] x_arr = new int[1001];
		int[] y_arr = new int[1001];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 3; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			x_arr[num1]++;
			y_arr[num2]++;
		}
		
		for(int j = 0; j < x_arr.length; j++) {
			if(x_arr[j] == 1) x = j;
			if(y_arr[j] == 1) y = j;
		}
		
		System.out.println(x + " " + y);
		
		
	}
}