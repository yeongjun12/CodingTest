import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String numStr =  sc.nextLine();
		
		String[] numArr = numStr.split(" ");
		
		System.out.println(Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]));
		
	}

}
