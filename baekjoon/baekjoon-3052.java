//baekjoon-3052.java

/* 
1. 반복문(for)안에서 수 10개를 입력 받아 배열에 넣는다.
2. 배열 안에 있는 수를 42로 나누고 나머지를 새로운 배열에 넣는다.
3. 반복문을 이용해 배열에 1부터 41까지 중복된 숫자의 개수를 파악한다.
4. 입력 값이 0부터 999까지 가능하기 때문에 원래 배열 값을 이용해 새로운 배열에다가 +1 씩 한다.
5. 새로운 배열 0부터 999까지의 값이 1보다 크면 결과 변수에다가 1을 추가해서 서로 다른 수를 파악한다.

입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다
*/

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner Sc = new Scanner(System.in);
    	
    	int[] arr = new int[10];
    	int[] count = new int[1000];
    	int result = 0;
    	for(int array_input=0; array_input<10; array_input++) {
    		arr[array_input] = Sc.nextInt();
    	}
    	int[] remain = new int[10];
    	for(int remain_input=0; remain_input<10; remain_input++) {
    		remain[remain_input] = arr[remain_input]%42;
    	}
    	for(int i=0; i<arr.length; i++) {
    		count[remain[i]] = count[remain[i]]+1;
    	}
    	for(int i=0; i<count.length; i++) {
    		if(count[i]>=1) {
    			result++;
    		}
    	}
    	System.out.println(result);
    }
}
