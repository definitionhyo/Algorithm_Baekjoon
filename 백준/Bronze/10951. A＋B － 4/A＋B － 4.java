
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		문제
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		각 테스트 케이스마다 A+B를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		StringTokenizer st; // StringTokenizer 객체 선언
		String input = ""; // 문자열 input 생성(nullpointer 오류 방지)
		int A; // 정수형 변수 A 선언
		int B; // 정수형 변수 B 선언
		
//		-------- 반복문 시작 -------- 
		while ((input = br.readLine()) != null ) {
			
			st = new StringTokenizer(input, " "); // StringTokenizer 객체 생성
			A = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 A에 대입
			B = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 B에 대입
			
			System.out.println(A + B);
		}
//		-------- 반복문 종료 -------- 
		
	}

}
