// baekjoon-2588.java
import java.util.Scanner;

public class baekjoon_3003{
    public static void main(String args[]){
    	Scanner Sc = new Scanner(System.in);
    	int a = Sc.nextInt();
    	String b = Sc.next();
    	char c0 = b.charAt(0);
    	char c1 = b.charAt(1);
    	char c2 = b.charAt(2);
    	int d0 = a*(c0-'0');
    	int d1 = a*(c1-'0');
    	int d2 = a*(c2-'0');
    	System.out.println(d2);
    	System.out.println(d1);
    	System.out.println(d0);
    	System.out.println(d2+(d1*10)+(d0*100));
    }
}
