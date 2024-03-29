
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		1-1) 두 정수 A와 B를 입력받은 다음,
//		A+B를 출력하는 프로그램을 작성하시오.

//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.

//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

//		2-1) 입력의 마지막에는 0 두 개가 들어온다.

//		출력
//		각 테스트 케이스마다 A+B를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		int A; // 정수형 변수 A 선언
		int B; // 정수형 변수 B 선언

		StringTokenizer st; // StringTokenizer 객체 선언
		
		String input = "";
		
//		-------- 2-1) 반복문 시작 --------
//		while (true) {
		while ((input = br.readLine()) != null) {
			
//		-------- 1-1) 반복문 시작 --------
		
//				st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성
				st = new StringTokenizer(input, " "); // StringTokenizer 객체 생성
				A = Integer.parseInt(st.nextToken()); // 정수형 형변환 후 A에 대입
				B = Integer.parseInt(st.nextToken()); // 정수형 형변환 후 B에 대입


//		-------- 1-1) 반복문 종료 --------
			
			if (A == 0 && B == 0) { // A, B == 0 일 경우 반복문 종료
				break;
			}
			
			System.out.println(A + B);
		}
//		-------- 2-1) 반복문 종료 --------
		
		// nullpointer 오류 발생(맨마지막 null 발생)
	}

}
