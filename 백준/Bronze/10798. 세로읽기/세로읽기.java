import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[5][15];
        
        for(int i = 0; i < 5; i++) {
        	String str = sc.nextLine();
        	for(int j = 0; j < str.length(); j++) {
        		arr[i][j] = str.charAt(j);
        	}
        }
        
        
        for(int i = 0; i < arr[0].length; i++) {
        	for(int j = 0; j < 5; j++) {
        		if(arr[j][i] == '\0') {
        			System.out.print("");
        		}else {
        			System.out.print(arr[j][i]);
        		}
        	}
        }
        
        sc.close();
    }
}
