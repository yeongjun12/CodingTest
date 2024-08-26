import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        while ((str = br.readLine()) != null) {
            if (str.equals(".")) {
                break;
            }
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                wr.write("yes\n");
            } else {
                wr.write("no\n");
            }
        }
        
        wr.flush();
        wr.close();
        br.close();
    }
}
