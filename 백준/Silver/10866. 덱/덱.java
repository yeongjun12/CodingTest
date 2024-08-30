import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
 
public class Main {
	static Deque<Integer> deque = new LinkedList<>();
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	
    	int count = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		String str = strArr[0];
    		int num = (strArr.length > 1) ? Integer.parseInt(strArr[1]) : -1;
    		
    		switch(str) {
    		case "push_front" : push_front(num);
    			break;
    		case "push_back" : push_back(num);
    			break;
    		case "pop_front" : wr.write(pop_front()+"\n");
    			break;
    		case "pop_back" : wr.write(pop_back()+"\n");
    			break;
    		case "size" : wr.write(size()+"\n");
    			break;
    		case "empty" : wr.write(empty()+"\n");
    			break;
    		case "front" : wr.write(front()+"\n");
    			break;
    		case "back" : wr.write(back()+"\n");
    			break;
    		}
    	}
    	wr.flush();
    	wr.close();
    	br.close();
    
    	}
    	
    public static void push_front(int num) {
    	deque.offerFirst(num);
    }
    
    public static void push_back(int num) {
    	deque.offerLast(num);
    }
    
    public static int pop_front() {
    	return (!deque.isEmpty()) ? deque.pollFirst() : -1;
    }
    
    public static int pop_back() {
    	return (!deque.isEmpty()) ? deque.pollLast() : -1;
    }
    
    public static int size() {
    	return deque.size();
    }
    
    public static int empty() {
    	return (deque.isEmpty()) ? 1 : 0;
    }
    
    public static int front() {
    	return (!deque.isEmpty()) ? deque.peekFirst() : -1;
    }
    
    public static int back() {
    	return (!deque.isEmpty()) ? deque.peekLast() : -1;
    }
    
    }