import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int count = 0;
        
        
        for(String k : strArr) {
        	if(k.isEmpty()) {
        		continue;
        	}
        	count++;
        }
        
        System.out.println(count);
        sc.close();
    }
}
