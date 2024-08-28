import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력 받기
        String[] strArr = br.readLine().split(" ");
        int size = Integer.parseInt(strArr[0]);  // 사람의 수 N
        int step = Integer.parseInt(strArr[1]);  // 제거할 순번 K
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1부터 size까지 리스트에 추가
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        
        int index = 0;
        wr.write("<");
        
        // 리스트에서 사람을 제거할 때까지 반복
        while (list.size() > 0) {
            // 현재 인덱스에서 (K-1)만큼 이동. 모듈러 연산으로 순환을 유지.
            index = (index + step - 1) % list.size();
            // 제거된 사람을 BufferedWriter에 직접 추가
            wr.write(String.valueOf(list.remove(index)));
            
            if (list.size() > 0) {
                wr.write(", ");
            }
        }
        
        wr.write(">\n");
        
        // 결과 출력 및 자원 정리
        wr.flush();
        wr.close();
        br.close();
    }
}
