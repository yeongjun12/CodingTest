import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int time = 0;
		String[] strArr = str.split("");
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].charAt(0) >= 'A' && strArr[i].charAt(0) <= 'C') {
				time += 3;
			}else if(strArr[i].charAt(0) >= 'D' && strArr[i].charAt(0) <= 'F') {
				time += 4;
			}else if(strArr[i].charAt(0) >= 'G' && strArr[i].charAt(0) <= 'I') {
				time += 5;
			}else if(strArr[i].charAt(0) >= 'J' && strArr[i].charAt(0) <= 'L') {
				time += 6;
			}else if(strArr[i].charAt(0) >= 'M' && strArr[i].charAt(0) <= 'O') {
				time += 7;
			}else if(strArr[i].charAt(0) >= 'P' && strArr[i].charAt(0) <= 'S') {
				time += 8;
			}else if(strArr[i].charAt(0) >= 'T' && strArr[i].charAt(0) <= 'V') {
				time += 9;
			}else {
				time += 10;
			}
		}
		
		System.out.println(time);
		
	
	}
}