// baekjoon-10430.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();
        int Result1 = (A+B)%C;
        int Result2 = ((A%C)+(B%C))%C;
        int Result3 = (A*B)%C;
        int Result4 = ((A%C)*(B%C))%C;        
        System.out.println(Result1);
        System.out.println(Result2);
        System.out.println(Result3);
        System.out.println(Result4);        
    }
}
