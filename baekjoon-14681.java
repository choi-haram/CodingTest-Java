// baekjoon-14681.java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        int y = Sc.nextInt();
        if (x>0 && y>0) {
        	System.out.println(1);
        } else if (x<0 && y>0) {
        	System.out.println(2);
        } else if (x<0 && y<0) {
        	System.out.println(3);
        } else {
        	System.out.println(4);
        }
    }
}
