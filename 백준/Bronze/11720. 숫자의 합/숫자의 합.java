
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
//		1-2) 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//		2) 출력
//		입력으로 주어진 숫자 N개의 합을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N = Integer.parseInt(br.readLine()); // 1-1
		String num = br.readLine(); // 1-2
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(String.valueOf(num.charAt(i)));
			sum += a;
		}
		
		System.out.println(sum);
		
	}

}
