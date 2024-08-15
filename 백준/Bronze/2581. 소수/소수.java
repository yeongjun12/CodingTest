import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = 0;
        
        for(int i = num1; i <= num2; i++) {
        	int count = 0;
        	
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) count++;
        	}
        	if(count == 2) list.add(i);
        }
        
        for(int j = 0 ; j < list.size(); j++) {
        	answer += list.get(j);
        }
        
        answer = (answer == 0 ) ? -1 : answer;
        System.out.println(answer);
        if(answer != -1)System.out.println(list.get(0));
        
        sc.close();
    }
}
