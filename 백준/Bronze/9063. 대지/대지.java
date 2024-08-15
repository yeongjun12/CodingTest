
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] x_arr = new int[count];
		int[] y_arr = new int[count];
		
		
		for(int i = 0; i < count; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
		    x_arr[i] = x;
		    y_arr[i] = y;
		}
		
		int x_min = x_arr[0], x_max = x_arr[0];
		int y_min =y_arr[0], y_max = y_arr[0];
		
		for(int j = 0; j < count; j++) {
			if(x_arr[j] < x_min) x_min = x_arr[j];
			if(x_arr[j] > x_max) x_max = x_arr[j];
			if(y_arr[j] < y_min) y_min = y_arr[j];
			if(y_arr[j] > y_max) y_max = y_arr[j];
		}
		System.out.println((x_max-x_min)*(y_max-y_min));
	}
}