import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int answer = 0;
		int max = 0;
		
		if(num1 == num2 && num2 == num3) {
			answer = 10000+num1*1000;
		}else {
			if(num1!=num2 && num1!=num3 && num2!=num3) { //세 변수가 모두 다를 때
				if(num1>num2 && num1>num3) {
					max = num1;
				}else if(num2>num1 && num2 > num3) {
					max = num2;
				}else {
					max = num3;
				}
				answer = max*100;
			} else { // 변수 두개만 같을 때
				if(num1 == num2 || num1 == num3) {
					answer = 1000+num1*100;
				}else {
					answer = 1000+num3*100;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
