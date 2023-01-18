// 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int answer_denum = 0;
        int answer_num = 0;
        int gcd = 0;
        answer_denum = (denum1*num2)+(denum2*num1);
        answer_num = num1*num2;
        for(int i=1; i<=answer_denum; i++){
            if((answer_num%i==0)&&(answer_denum%i==0)){
                gcd = i;
            }
        }
        answer[0] = answer_denum/gcd;
        answer[1] = answer_num/gcd;
        return answer;
    }
}
