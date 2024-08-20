import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력 읽기
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        // 문자열을 저장할 HashSet
        HashSet<String> set = new HashSet<>();
        
        // 집합 S에 문자열 추가
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        int count = 0;
        
        // 검사할 문자열이 집합에 포함되어 있는지 확인
        for (int i = 0; i < M; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }
        
        // 결과 출력
        wr.write(count + "\n");
        wr.flush();
        br.close();
        wr.close();
    }
}
