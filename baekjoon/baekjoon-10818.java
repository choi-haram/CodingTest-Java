//baekjoon-10818.java

/* N개의 정수가 주어지니 Scanner을 이용해서 입력받기
첫번 째 입력은 정수형 input_size 변수로 받기
input_size 만큼의 크기의 배열을 만들고
for문 돌려서 input_size 값 만큼 배열에 반복해서 넣기
그다음 배열 0번이 1번이랑 비교하고 작은 걸 정수형 compare 변수에 넣는다
또 다시 2번이랑 비교....이런식으로 반복
*/

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        
        int input_size = Sc.nextInt();
        int[] arr = new int[input_size];
        for(int i=0; i<input_size; i++){
            arr[i] = Sc.nextInt();
        }
        int compare = arr[0];
        int compare_max = arr[0];
        int compare_min = arr[0];
        int check = input_size - 1;
        for(int i=0; i<check; i++){
            if(compare>=arr[i+1]){
                compare_max = compare;
                if(compare_min>arr[i+1]) {
                	compare_min = arr[i+1]; 
                }
                compare = compare_max;
            } else {
            	compare_max = arr[i+1];
            	if(compare_min>arr[i+i]) {
            		compare_min = arr[i+1];
            	}
            	compare = compare_max;
            }
        }
        System.out.print(compare_min);
        System.out.print(" ");
        System.out.print(compare_max);
    }
}
