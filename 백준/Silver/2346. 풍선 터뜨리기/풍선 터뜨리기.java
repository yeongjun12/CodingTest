import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	Deque<int[]> deque = new ArrayDeque<>();
    	int size = Integer.parseInt(br.readLine());
    	String[] numStrArr = br.readLine().split(" ");
    	
    	for(int i = 0 ; i < size; i++) {
    		int[] tmp = new int[2];
    		tmp[0] = i+1; //풍선 인덱스
    		tmp[1] = Integer.parseInt(numStrArr[i]); //풍선 값
    		
    		deque.offerLast(tmp);
     	}
    	
    	int moveValue = 0;
    	
    	while(deque.size() > 0) {
    		
    		if(moveValue >= 0) {
    			for(int i = 1; i < moveValue; i++) {
        			deque.offerLast(deque.pollFirst());
        			
        		}
    		}else {
    			for(int i = 1; i < -moveValue; i++) {
        			deque.offerFirst(deque.pollLast());
        		}
    		}
    		int index = (moveValue >= 0) ? deque.peekFirst()[0] : deque.peekLast()[0];
    		moveValue =  (moveValue >= 0) ? deque.pollFirst()[1] : deque.pollLast()[1] ;
    		wr.write(index +" ");
    	}
		   wr.flush();
		   wr.close();
		   br.close();
    }
}
