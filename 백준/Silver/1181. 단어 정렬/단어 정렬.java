import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < count; i++) {
        	list.add(br.readLine());
        }
        
        for (int i = count - 1; i >= 0; i--) {
            String item = list.get(i);
            for (int j = 0; j < i; j++) {
                if (list.get(j).equals(item)) {
                    list.remove(i);
                    break;
                }
            }
        }
        
        Collections.sort(list , (s1,s2) -> {
        	//문자열 길이 비교
        	int lengthCompare = Integer.compare(s1.length(), s2.length());
        	if(lengthCompare != 0 ) {
        		return lengthCompare; //길이에 따라 정렬
        	}else {
        		//길이가 같으면 사전 순으로 비교
        		return s1.compareTo(s2);
        	}
        });
        
        for(String s : list) System.out.println(s);
    }
}
