import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int num : list) sb.append(num).append('\n');
		
		System.out.println(sb);
		sc.close();
	}
	
}