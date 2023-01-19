// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

class Solution {
    public int[] solution(long n) {
        int[] answer;
        long tmp = n;
        int n_length = 0;
        while(tmp>0){ // 자연수 n 길이 구하기
            n_length++;
            tmp = tmp/10;
        }
        answer = new int[n_length];
        for(int i=0; i<n_length; i++){
            System.out.println(n);
            answer[i] = (int) (n%10);
            System.out.println(answer[i]);
            n = n/10;
        }
        return answer;
    }
}
