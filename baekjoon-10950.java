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
