import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(num2 > 0) {
			System.out.println(num1 *(num2 % 10)); 
			sum += (num1 *(num2 % 10)) * i;
			num2 = num2 / 10;
			i *= 10;
		}
		
		System.out.println(sum);
		
	}

}
