// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] tmp = new int[array.length];
        int min = 101; // n이 100까지 나오기 때문에 101로 초기화
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            tmp[i] = Math.abs(array[i] - n);
        }
        for(int i=0; i<array.length; i++){
            if(tmp[i]<min){
                min = tmp[i];
                answer = array[i];
            }
        }
        return answer;
    }
}
