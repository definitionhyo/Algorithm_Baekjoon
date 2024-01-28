
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더를 통해 불기연도 받음
		int y = Integer.parseInt(br.readLine()); // 정수 y 에 저장
		System.out.println(y - 543); // 불기연도 - 543 = 서기연도
		br.close();

	}

}