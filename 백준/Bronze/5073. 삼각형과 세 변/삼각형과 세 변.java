import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			list.add(num1);
			list.add(num2);
			list.add(num3);
			
			Collections.sort(list);
			
			if(num1+num2+num3 == 0) break;
			
			if(list.get(0)+list.get(1) > list.get(2)) {
				if(num1 == num2 && num2 == num3) {
					System.out.println("Equilateral");
				}else if(num1 == num2 || num2 == num3 || num1 == num3) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}else {
				System.out.println("Invalid");
			}
		}
		
		sc.close();
	}
}