import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 스페이스바를 통해 여러개의 숫자 받음 
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // readline으로 한줄 받아온걸 구분자 " " 로 구분
		int A = Integer.parseInt(st.nextToken()); // nextToken에서 String으로 받아온걸 Int로 변환
		int B = Integer.parseInt(st.nextToken()); // nextToken에서 String으로 받아온걸 Int로 변환
		System.out.println( A + B );
		br.close();
	}

}