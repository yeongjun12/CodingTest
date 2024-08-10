import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str).reverse();
		
		int result = (sb.toString().equals(str)) ? 1 : 0;
		System.out.println(result);
		}
	}
