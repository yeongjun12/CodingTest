import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cardCount = new HashMap<>();
        
        // 카드 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }
        
        // 쿼리 처리
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(cardCount.getOrDefault(query, 0)).append(" ");
        }
        
        wr.write(sb.toString().trim());
        wr.flush();
        wr.close();
        br.close();
    }
}
