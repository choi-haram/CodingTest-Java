// baekjoon-2525.java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int H = Sc.nextInt();
        int M = Sc.nextInt();
        int runningTime = Sc.nextInt();
        int afterM = M+runningTime;
        
        if(afterM>59) {
	        for(int i=0; afterM>59; ) {
	        	if(H>22) {
	        		H = 0;
	        	} else {
	        		H = H+1;
	        	}
	        	afterM = afterM-60;
	        }
        } 
        System.out.println(H+" "+afterM);
    }
}
