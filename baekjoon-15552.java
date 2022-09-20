// baekjoon-15552.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	String[] strs = br.readLine().split(" ");
        	int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            bw.write(a+b+"\n");    	
        }
        bw.flush();
	}
}
/* 
소요 시간
시간초과 문제를 해결하기 위해 오래걸림
*/
