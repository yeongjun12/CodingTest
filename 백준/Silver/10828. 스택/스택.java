import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static int[] stack;
	static int index = 0;
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
       
       int n = Integer.parseInt(br.readLine());
       stack = new int[n];
       
       for(int i = 0; i < n; i++) {
    	   String[] strArr = br.readLine().split(" ");
    	   String str = strArr[0];
    	   int num = strArr.length > 1 ? Integer.parseInt(strArr[1]) : -1; // `push` 명령어의 경우만 num을 파싱
    	   
    	   
    	   switch(str) {
    	   case "push" : push(num);
    	   		break;
    	   case "pop" : wr.write(Integer.toString(pop())+'\n');
    	   		break;
    	   case "size" : wr.write(Integer.toString(size())+'\n');
    	   		break;
    	   case "empty" : wr.write(Integer.toString(empty())+'\n');
    	   		break;
    	   case "top" : wr.write(Integer.toString(top())+'\n');
    	   }
    	  
       }
       wr.flush();
       wr.close();
       br.close();
    }
    
    static void push(int X) {
    	stack[index++] = X;
    }
    
    static int pop() {
    	 if (index > 0) {
             return stack[--index];
         } else {
             return -1; // 스택이 비어있을 때
         }
    }
    
    static int size() {
    	return index;
    }
    
    static int empty() {
    	int result = (index == 0) ? 1 : 0;
    	return result;
    }
    
    static int top() {
    	int result = (index == 0) ? -1 : stack[index-1];
    	return result;
    }
}
