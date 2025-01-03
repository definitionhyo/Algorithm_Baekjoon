
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		
//	         *
//	        ***
//	       *****
//	      *******
//	     *********
//	      *******
//	       *****
//	        ***
//	         *
//		
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//		출력
//		첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N = Integer.parseInt(br.readLine()); 
		
//		-------- N번째 줄 까지 별 찍기 시작 --------
        for(int i = 0; i < N; i++) {
        	
//    		-------- 공백 출력 --------
            for(int j = 0; j < N - 1 - i; j++) {
                System.out.print(" ");
            }
            
//    		-------- 별 출력 --------
            for(int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
//		-------- N번째 줄 이후 별 찍기 시작 --------
        for(int i = N - 2; i >= 0; i--) {
        	
//    		-------- 공백 출력 --------
            for(int j = 0; j < N - 1 - i; j++) {
                System.out.print(" ");
            }
            
//    		-------- 별 출력 --------
            for(int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		

		
		
		
	}

}




