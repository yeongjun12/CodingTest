import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String numStr = br.readLine();
        String[] numArr = numStr.split("");
        Integer[] answerArr = new Integer[numArr.length];
        
        for(int i = 0; i < numArr.length; i++) {
        	answerArr[i] = Integer.parseInt(numArr[i]);
        }
        
        Arrays.sort(answerArr, Collections.reverseOrder());
        
        for(int num :answerArr) System.out.print(num);
    }
}
