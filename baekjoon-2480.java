// baekjoon-2480.java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int dice1 = Sc.nextInt();
        int dice2 = Sc.nextInt();
        int dice3 = Sc.nextInt();
        int result = 0;
        int bestdice = 0;
        if(dice1 == dice2 && dice2 == dice3) {
        	bestdice = dice1;
        	result = 10000+(dice1*1000);
        } else if(dice1==dice3 && dice1!=dice2 && dice2!=dice3) { // 1 2 1
        	bestdice = dice1; 
        	result = 1000+(dice1*100);
        } else if(dice1==dice2 && dice1!=dice3 && dice2!=dice3) { // 1 1 2
        	bestdice = dice1; 
        	result = 1000+(dice1*100);
        } else if(dice2==dice3 && dice1!=dice2 && dice1!=dice3){ //2 1 1
        	bestdice = dice3; 
        	result = 1000+(dice3*100);
        } else { // 2 3 4
        	if(dice1>dice2) {
        		if(dice1>dice3) {
        			bestdice = dice1;
        			result = dice1*100;
        		} else {
        			bestdice = dice3;
        			result = dice3*100;
        		}
        	} else if(dice2>dice1) {
        		if(dice2>dice3) {
        			bestdice = dice2;
        			result = dice2*100;
        		} else {
        			bestdice = dice3;
        			result = dice3*100;
        		} 
        	}
        }
        System.out.println(result);
    }
}
