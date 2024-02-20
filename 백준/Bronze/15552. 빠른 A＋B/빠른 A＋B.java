
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 객체 생성
		
		StringTokenizer st; // StringTokenizer 객체 선언
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수 저장
		
		// --------- 반복문 시작 --------
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"); // 형변환 후 계산 후 줄바꿈 까지한 후 버퍼에 저장 
		}
		// --------- 반복문 종료 --------
		
		bw.flush(); // 버퍼에 있는 데이터 출력 후 비움
	}

}
