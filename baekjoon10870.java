//백준 10870번 풀이


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10870 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		System.out.println(pivo(N));

	}
	// pivo(4)=pivo(3)+pivo(2)=pivo(1)+pivo(0)+pivo(1)+pivo(1)+pivo(0)=3

	private static int pivo(int i) {
		// TODO Auto-generated method stub
		if (i == 1) {
			return 1;// 1이 들어올 경우 1반환
		} else if (i == 0) {
			return 0;// 0이 들어올 경우 0반환
		} else {
			return pivo(i - 2) + pivo(i - 1);
		} // 재귀적으로 더하기 연산 수행
	}

}
