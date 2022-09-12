//baekjoon-2739.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for(int i = 1; i<10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
