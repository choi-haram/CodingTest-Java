// baekjoon-8393.java
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int repeat = Sc.nextInt();
        int sum = 0;
        	for(int i=1; i<=repeat; i++) {
        		sum += i ;
        }
    		System.out.println(sum);
    }
}

/* 
소요 시간
이해 : 1분
계획 : 3분
검증 : 1분
풀이 : 2분
채점 : -
합계 : 7분
*/
