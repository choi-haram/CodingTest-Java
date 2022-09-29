//baekjoon-2438.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int repeat = Sc.nextInt();
        for(int finish_repeat=1; finish_repeat<=repeat; finish_repeat++){
           for(int star=1; star<=finish_repeat; star++) {
        	   System.out.print("*");
           }
           System.out.println();
        }
    }
}
