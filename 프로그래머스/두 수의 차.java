// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(-50000<=num1 && 50000>=num1 && -50000<=num2 && 50000>=num2) {
            answer = num1-num2;    
        }
        return answer;
    }
}
