import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0;
        
        
        for(int i = 0; i < count; i++) {
        	int num = sc.nextInt();
        	int check = 0;
        	
        	for(int j = 1; j <= num; j++) {
        		if(num % j == 0) check++;
        	}
        	
        	if(check == 2) answer++;
        }
        System.out.println(answer);

        sc.close();
    }
}
