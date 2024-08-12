import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strArr[] = str.split(" ");
        List<String> list = new ArrayList<>();
        
        int num = Integer.parseInt(strArr[0]);
        int base = Integer.parseInt(strArr[1]);
        
        while(num > 0) {
        	list.add(""+num% base);
        	num = num / base;
        }
        
        for(int i = list.size() - 1; i >= 0; i--) {
        	if(list.get(i).length() <= 1) {
        		System.out.print(list.get(i));
        	}else {
        		System.out.print((char)(Integer.parseInt(list.get(i))+55));
        	}
        }
        sc.close();
    }
}
