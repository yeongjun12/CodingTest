import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[3];
        
        // 세 각도 입력받기
        numArr[0] = sc.nextInt();
        numArr[1] = sc.nextInt();
        numArr[2] = sc.nextInt();
        
        int sum = numArr[0] + numArr[1] + numArr[2];
        
        // 유효한 삼각형인지 검사
        if(sum == 180 && numArr[0] > 0 && numArr[1] > 0 && numArr[2] > 0) {
            if(numArr[0] == numArr[1] && numArr[1] == numArr[2]) {
                System.out.println("Equilateral"); // 정삼각형
            } else if(numArr[0] == numArr[1] || numArr[1] == numArr[2] || numArr[0] == numArr[2]) {
                System.out.println("Isosceles"); // 이등변삼각형
            } else {
                System.out.println("Scalene"); // 부등변삼각형
            }
        } else {
            System.out.println("Error"); // 오류 (유효한 삼각형이 아님)
        }
        
        sc.close();
    }
}
