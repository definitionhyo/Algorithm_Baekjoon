
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		문제
//		알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
//		단, 대문자와 소문자를 구분하지 않는다.
//		
//		입력
//		첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
//		주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//		
//		출력
//		첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
//		단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int[] ary = new int[26]; // 알파벳 개수(26) 크기의 정수형 배열 생성
		String str = br.readLine(); // 입력받은 단어 저장
		
//		-------- 중복 개수 저장 반복문 시작 --------
		for(int i = 0; i < str.length(); i++) {
			
//			-------- 소문자 --------
			for(int j = 0; j < 26; j++) {
				if(str.charAt(i) == ('a' + j)) {
					ary[j] += 1;
				} 
			}
			
//			-------- 대문자 --------
			for(int k = 0; k < 26; k++) {
				if(str.charAt(i) == ('A' + k)) {
					ary[k] += 1;
				}
			}
			
		}
//		-------- 중복 개수 저장 반복문 종료 --------
		
//		-------- 최댓값 찾는 반복문 시작 --------
		int count = 0; // 최댓값 저장할 정수형 변수
		char ans = 0; // 출력할 문자 생성
		boolean duplicate = false; 
		
		for(int l = 0; l < 26; l++) {
			if(ary[l] > count) {
				count = ary[l];
				ans = (char)(l + 'A');
				duplicate = false;
			} else if(ary[l] == count) {
				duplicate = true;
			}
		}
		
		if(duplicate == true) {
			System.out.print("?");
		} else {
			System.out.print(ans);
		}
//		-------- 최댓값 찾는 반복문 시작 --------
		
	}

}

