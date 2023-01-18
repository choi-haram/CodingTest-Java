// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

class Solution {
    public int solution(int n) {
        int answer = 0;
        int even = 0;
        for(int i=0; i<n/2; i++){
            even = even+2;
            answer = answer+even;
        }
        return answer;
    }
}
