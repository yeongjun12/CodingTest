import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int answer = 0;
		
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int findNum = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == findNum) {
				answer++;
			}
		}
		
	   System.out.print(answer);
		
		
				}
}
