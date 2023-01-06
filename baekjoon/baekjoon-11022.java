//baekjoon-11022.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int repeat = Sc.nextInt();
        for(int case_num=1; case_num <= repeat; case_num++){
            int left = Sc.nextInt();
            int right = Sc.nextInt();
            int result_left_right = left+right;
            System.out.println("Case #"+case_num+": "+left+" + "+right+" = "+result_left_right);
        }
    }
}
