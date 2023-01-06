//baekjoon-2439.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	int repeat;
    	int now;
    	int blank;
    	int star;
        Scanner Sc = new Scanner(System.in);
        repeat = Sc.nextInt();
        for(now=1; now<=repeat; now++){
        	for(blank=repeat; blank>now; blank--){
                System.out.print(" ");
            }
            for(star=1; star<=now; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
