//백준 2292번 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1 1
		// 2~7 6 2
		// 8~19 12 3
		// 20~37 18 4
		// 38-61 24 5
		// 62-70 30 1+6*1+6*2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int count = 1;
		int range = 2;
		if (N == 1) {
			System.out.println(1);
		} else {
			while (range <= N) {
				range = range + 6 * count;
				count++;
			}
			System.out.println(count);
		}
	}

}
