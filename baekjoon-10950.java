// baekjoon-10950.java
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int repeat = Sc.nextInt();
        for(int i=0; i<repeat; i++){
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            System.out.println(a+b);
        }
    }
}

/* 
소요 시간

이해 : 1분
계획 : 1분
검증 : 1분
풀이 : 2분
채점 : -
합계 : 5분

*/
