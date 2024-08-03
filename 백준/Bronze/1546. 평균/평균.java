import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0;
		double sum = 0;
		sc.nextLine();
		String line = sc.nextLine();
		
		String[] numbers = line.split(" ");
		max = Integer.parseInt(numbers[0]);
		
		for(int i=0; i<numbers.length; i++) {
			if(Integer.parseInt(numbers[i]) > max) {
				max = Integer.parseInt(numbers[i]);
			}
		}
		
		
		for(String number : numbers) {
			sum += (Double.parseDouble(number)/max)*100;
		}
		
		
		System.out.println(sum/num);
	}

}
