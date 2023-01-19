// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

import java.util.*;

public class Solution {
    public int solution(int n) {
        String tmp = Integer.toString(n);
        int answer=0;
        for(int i = 0; i<tmp.length(); i++){ // tmp.length()를 이용해 자리수만큼 반복하게 하기
            answer += tmp.charAt(i)-'0';
        }
        return answer;
    }
}

// 1. n을 Stirng으로 변환
// 2. n에서 charAt()을 이용해 자리수 만큼 가져와서 더하기
