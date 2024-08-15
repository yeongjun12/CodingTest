import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        
        while(num != 1) {
        	for(int i = 2; i<=num; i++) {
        		if(num % i == 0 ) {
        			list.add(i);
        			num = num / i;
        			break;
        		}
        	}
        }
        for(int j = 0; j < list.size(); j++) {
        	System.out.println(list.get(j));
        }
        
        sc.close();
    }
}
