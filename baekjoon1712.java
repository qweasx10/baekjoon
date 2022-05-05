// 백준 1712번 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int answer = 1;

		if (K >= M) {// k가 m보다 큰 경우는 무조건 -1을 출력
			answer = -1;
			System.out.println(answer);
		} else {
			answer = N / (M - K) + 1;// 횟수는 n을 m에서 k를 뺀값으로 나눈 후 1을 더해 구함
			System.out.println(answer);

		}

	}

}
