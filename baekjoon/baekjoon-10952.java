// baekjoon-10952.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int start_while = 0;
        while(start_while==0) {
        	int sum_left = Sc.nextInt();
        	int sum_right = Sc.nextInt();
        	int sum = sum_left+sum_right;
        	if(sum==0) {
        		break;
        	}
        	System.out.println(sum);
        }
    }
}
