import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int cutLine = sc.nextInt();
		Integer[] arr = new Integer[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[cutLine - 1]);
		
		sc.close();
	}
	
}