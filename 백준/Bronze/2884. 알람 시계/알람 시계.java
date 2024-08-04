import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num2 >= 45) {
			System.out.println(num1 +" "+ (num2-45));
		}else if(num1 > 0 && num2 <45) {
			System.out.println((num1-1)+" "+(60 + (num2 - 45)));
		}else {
			System.out.println( "23 "+(60 + (num2 - 45)));
		}
		sc.close();
	}
}
