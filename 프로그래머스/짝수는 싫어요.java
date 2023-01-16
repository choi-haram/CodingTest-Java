// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(n%2==1){
            answer = new int[n/2+1];
            for(int i=0; i<n/2+1; i++){
                answer[i] = 1+(2*i);
            }
        }
        if(n%2==0){
            answer = new int[n/2];
            for(int i=0; i<n/2; i++){
                answer[i] = 1+(2*i);
            }
        }
        return answer;
    }
}
