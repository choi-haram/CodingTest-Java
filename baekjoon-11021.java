// baekjoon-11021.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        
        int repeat = Sc.nextInt();
        for(int caseNum=1; caseNum<=repeat; i++){
            int left = Sc.nextInt();
            int right = Sc.nextInt();
            int sum = left+right;
            System.out.println("Case #"+caseNum+": "+sum);
        }
    }
}
