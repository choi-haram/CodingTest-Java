// 문제 : 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

// 매개변수 int 'n' -> 문자열로 변환 -> char 배열에 넣기 -> int 배열에 넣기 -> 덧셈해서 출력
class Solution {
    public int solution(int n) {
        String casting_n = Integer.toString(n); // int 'n'을 String으로 변환
        int len = casting_n.length(); // casting_n 길이를 변수 len에 넣기
        int answer = 0; 
        char[] tmp = new char[len]; // casting_n의 숫자를 자리마다 나눠 저장할 char 타입의 배열 'tmp' 생성
        int[] tmp1 = new int[len]; // tmp 배열에서의 덧셈이 불가능하므로 int 타입의 배열 'tmp1' 생성
        for(int i=0; i<len; i++){
            tmp[i] = casting_n.charAt(i);
        }
        for(int i=0; i<len; i++){
            tmp1[i] = tmp[i]-'0';
        }
        for(int i=0; i<len; i++){
            answer = answer+tmp1[i];   
        }
        return answer;
    }
}
