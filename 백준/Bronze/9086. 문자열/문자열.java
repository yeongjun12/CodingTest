import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		// nextInt() 호출 후 입력 버퍼에 남아 있는 개행 문자 제거
        sc.nextLine();
		
		for(int i=0; i<count; i++) {
			String str = sc.nextLine();
			System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
		}
		sc.close();
	}
}
