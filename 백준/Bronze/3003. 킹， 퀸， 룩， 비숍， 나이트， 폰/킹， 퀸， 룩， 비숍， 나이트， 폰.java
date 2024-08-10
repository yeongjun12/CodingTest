import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,1,2,2,2,8};
		int answer[] = new int[6];
		
		for(int i = 0; i<6; i++) {
			answer[i] = sc.nextInt();
		}
		
		for(int i = 0; i<6; i++) {
			
			if(arr[i] > answer[i]) {
				System.out.print(arr[i]-answer[i]+ " ");
			}else if(arr[i] < answer[i]) {
				System.out.print(arr[i]-answer[i]+ " ");
			}else {
				System.out.print(0+" ");
			}
		}
		
		sc.close();
	
	}
}