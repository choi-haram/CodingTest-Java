// baekjoon-2884.java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int H = Sc.nextInt();
        int M = Sc.nextInt();
        int minus = M-45;
        int afterM;
        int afterH;
        if(M<45) {
        	afterM = 60 + minus;
        	afterH = H-1;
        } else {
        	afterM = minus;
        	afterH = H;
        }
        if(afterH<0) {
        	afterH = 23;
        }
        System.out.print(afterH+" "+afterM);
    }
}
