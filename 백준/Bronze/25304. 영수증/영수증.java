import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int totalCount = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=totalCount; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			sum += (price*count);
		}
		String result = (total == sum) ? "Yes" : "No";
		System.out.println(result);
		sc.close();
		
	}

}
