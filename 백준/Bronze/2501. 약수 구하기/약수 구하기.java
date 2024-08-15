import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int num1 = sc.nextInt();
		int num2 = sc.nextInt() - 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=num1; i++) {
			if(num1 % i == 0) list.add(i);
		}
		if(num2 >= 0 && num2 < list.size()) {
			System.out.println(list.get(num2));
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}
