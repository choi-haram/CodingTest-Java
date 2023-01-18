// 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String my_string) {
        int str_num = my_string.length();        
        char[] num = new char[str_num]; // create array num
        int j = 1;
        for(int i=0; i<str_num; i++){
            num[i] = my_string.charAt(str_num-j);
            j++;
        }
        String answer = new String(num);
        return answer;
    }
}
