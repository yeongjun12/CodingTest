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
        
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        Stack<Integer> stack = new Stack<>();
        int expected = 1;
        
        for (String s : input) {
            int student = Integer.parseInt(s);
            
            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
            
            if (student == expected) {
                expected++;
            } else {
                stack.push(student);
            }
        }
        
        // After processing all the students in the queue
        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }
        
        if (expected == N + 1) {
            wr.write("Nice\n");
        } else {
            wr.write("Sad\n");
        }
        
        wr.flush();
        wr.close();
        br.close();
    }
}
