import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
       
       Set<String> noListen = new HashSet<>();
       Set<String> noSee = new HashSet<>();
       List<String> answerList = new ArrayList<>();
       
       String[] strArr = br.readLine().split(" ");
       int N = Integer.parseInt(strArr[0]);
       int M = Integer.parseInt(strArr[1]);
       
       for(int i = 0; i < N; i++) {
    	   String name = br.readLine();
    	   noListen.add(name);
       }
       
       for(int i = 0; i < M; i++) {
    	   String name = br.readLine();
    	   noSee.add(name);
       }
       
       Set<String> common = new HashSet<>(noListen);
       common.retainAll(noSee);
       
       TreeSet<String> sortedCommon = new TreeSet<>(common);
       
       wr.write(sortedCommon.size()+"\n");
       for(String name : sortedCommon) wr.write(name+"\n");
       
       wr.flush();
       wr.close();
       br.close();
       
    }
    
}
