import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 개의 Map을 생성합니다.
        Map<Integer, String> numberToName = new HashMap<>();
        Map<String, Integer> nameToNumber = new HashMap<>();
        
        // 입력된 숫자와 포켓몬 개수를 읽습니다.
        String[] strArr = br.readLine().split(" ");
        int pokemonLength = Integer.parseInt(strArr[0]);
        int count = Integer.parseInt(strArr[1]);
        
        // 포켓몬 데이터를 입력받아 두 개의 Map에 저장합니다.
        for (int i = 1; i <= pokemonLength; i++) {
            String pokemonName = br.readLine();
            numberToName.put(i, pokemonName);
            nameToNumber.put(pokemonName, i);
        }
        
        // 쿼리를 처리합니다.
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            if (input.matches("\\d+")) { // 숫자 입력
                int number = Integer.parseInt(input);
                bw.write(numberToName.get(number) + "\n");
            } else { // 문자열 입력
                bw.write(nameToNumber.get(input) + "\n");
            }
        }
        
        // BufferedWriter를 플러시하여 출력합니다.
        bw.flush();
        bw.close();
        br.close();
    }
}
