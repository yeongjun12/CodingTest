import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    
    	int n = sc.nextInt();
    	sc.nextLine(); // nextInt() 호출 후 남아 있는 개행 문자 제거
    	
    	for(int i = 0 ; i < n; i++) {
    		String[] words = sc.nextLine().split(" ");
    		
    		for(String word : words) {
    			StringBuilder sb = new StringBuilder();
    			sb.append(word);
    			System.out.print(sb.reverse().toString()+" ");
    		}
    		System.out.println();
    	}
    	
    	sc.close();
    }
    
}
