// baekjoon-10951.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        while(Sc.hasNext()){
            int sum_left = Sc.nextInt();
            int sum_right = Sc.nextInt();
            int sum = sum_left + sum_right;
            System.out.println(sum);
        }
    }
}
