//baekjoon-1110.java
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner Sc = new Scanner(System.in);
    	int i = 0;
      	int input = Sc.nextInt();
      	int compare = input;
      	
    	while(i!=-1) {
    		input = ((input%10)*10)+ (((input/10)+(input%10))%10);
    		i++;
    		
    		if(compare==input) {
    			break;
    		}
    	}
    	System.out.println(i);
    }
}
