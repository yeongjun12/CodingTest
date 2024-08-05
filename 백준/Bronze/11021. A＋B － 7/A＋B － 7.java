
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            // 형식에 맞게 문자열을 작성
            String result = "Case #" + i + ": " + (num1 + num2);
            bw.write(result + "\n");  // 각 결과 뒤에 줄바꿈 추가
        }
        
        // 버퍼에 남아 있는 데이터를 출력
        bw.flush();
        // 스트림을 닫음
        bw.close();
        br.close();
    }
}
