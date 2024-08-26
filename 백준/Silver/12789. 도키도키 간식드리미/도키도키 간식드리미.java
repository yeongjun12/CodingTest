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

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");
        int flag = 1;

        for (String s : numArr) {
            int student = Integer.parseInt(s);
            
            // Process stack if the top of the stack is the expected number
            while (!stack.isEmpty() && stack.peek() == flag) {
                stack.pop();
                flag++;
            }
            
            if (student == flag) {
                flag++;
            } else {
                stack.push(student);
            }
        }

        // Final check of the stack
        while (!stack.isEmpty() && stack.peek() == flag) {
            stack.pop();
            flag++;
        }

        if (flag == N + 1) {
            wr.write("Nice\n");
        } else {
            wr.write("Sad\n");
        }

        wr.flush();
        wr.close();
        br.close();
    }
}
