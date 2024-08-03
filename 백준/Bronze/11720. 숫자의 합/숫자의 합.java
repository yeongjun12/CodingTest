
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String numStr = sc.next();
		char[] charArr = numStr.toCharArray();
		
		for(int i = 0; i<charArr.length; i++) {
			sum += charArr[i] - '0';
		}
		
		System.out.println(sum);
	}

}