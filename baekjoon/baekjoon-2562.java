//baekjoon-2562.java

/* 9개의 서로다른 자연수 주어짐(1부터 100까지) 최대값을 구하고 몇 번째로 주어진지를 구하는 문제
먼저 Scanner을 이용하여 입력받은 9개의 자연수를 하나의 배열안에 넣는다.
넣은 배열을 비교해서 최대값 변수에 집어넣는다.
서로 다른 자연수이기 때문에 반복문(for)을 이용해 최대값 변수와 배열을 비교해서 몇 번째로 들어있는지 찾자
*/

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        for(int start=0; start<9; start++){  
            arr[start] = Sc.nextInt();
        }
        int max=0;
        for(int i=0; i<9; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int numberOfMax = 0;
        for(int whereMax=0; whereMax<9; whereMax++) {
        	if(max==arr[whereMax]) {
        		numberOfMax = whereMax+1; //배열은0부터 순서는 1부
        	}
        }
        System.out.println(max);
        System.out.println(numberOfMax);
    }
}
