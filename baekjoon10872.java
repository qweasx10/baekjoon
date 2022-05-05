//백준 10872번 풀이

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class baekjoon10872 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	      int N = Integer.parseInt(st.nextToken());//입력 받기
	  
	      if (N==0) {
	    	  System.out.println(1);//N=0 일 때 1출력 
	    	  
	      }else {
	    	  System.out.println(facto(N));
	      }
	      //facto(5)=facto(4)*5.... 5*4*3*facto(2)

	}

	private static int facto(int i) {
		// TODO Auto-generated method stub
		if(i==1) {
			return 1;//1이 들어올 경우 1반환
		}
		return facto(i-1)*i;//재귀적으로 곱하기 연산 수행
	}

}
