class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1Binary = new String[n];
        String[] arr2Binary = new String[n];
        
        for(int i = 0; i < arr1.length; i++){
            int number1 = arr1[i];
            int number2 = arr2[i];
            StringBuilder binary1 = new StringBuilder();
            StringBuilder binary2 = new StringBuilder();
                       
            // 이진수로 변환
            while(number1 > 0 || number2 > 0){
                int remainder1 = number1 % 2;   
                int remainder2 = number2 % 2;
                binary1.insert(0, remainder1);   
                binary2.insert(0, remainder2);
                number1 = number1 / 2;
                number2 = number2 / 2;
            }  
               
            // 부족한 자릿수를 0으로 채움
            while(binary1.length() < n){
                binary1.insert(0, "0");
            }
            while(binary2.length() < n){
                binary2.insert(0, "0");
            }
            
            arr1Binary[i] = binary1.toString();
            arr2Binary[i] = binary2.toString();
        }
        
        // OR 연산 및 결과 이진수로 변환
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(arr1Binary[i], 2) | Integer.parseInt(arr2Binary[i], 2);
            String binary = Integer.toBinaryString(num);
            
            // 결과 이진수의 자릿수가 n보다 작을 경우 0으로 채움
            while(binary.length() < n){
                binary = "0" + binary;
            }
            // 1을 #으로, 0을 공백으로 치환
            binary = binary.replace('1', '#').replace('0', ' ');
            answer[i] = binary;
        }
        
        return answer;
    }
}
