import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String strArr[] = str.split(" ");
        
        
        int num = Integer.parseInt(strArr[1]);
        char[] charArr = strArr[0].toCharArray();
        
        int sum = 0;
        
        for(int i = 0; i < charArr.length; i++ ) {
        	if(charArr[i] >= '0' && charArr[i] <= '9') {
        		sum += (charArr[i] - '0') * Math.pow(num, charArr.length - 1 - i);
        	}else {
        		sum += (int) ((charArr[i]-'A' + 10) * Math.pow(num, charArr.length - 1 - i));
        	}
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}
