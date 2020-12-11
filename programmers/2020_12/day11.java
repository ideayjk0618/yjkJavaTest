class Solution {
    public long solution(int n) {
        long answer = 0;
        if (1 > n || 100000 < n) {
            return answer;
        } else if (n == 1) {
            answer = 1;
        } else {
            // 7번부터 실패뜸
            // 힌트 : 피보나치 수열은 숫자가 금방 커지기 때문에 컴퓨터가 수용할수있는 범위를 넘어선다.
            // ㄴ 각 숫자에 1234567를 나눠서 더 해주고 나머지 값을 받는다.
            
            int index = 2; // 피보나치 수 (인덱스)
            int first = 0; // F(0)
            int second = 1; // F(1)
            int result = 0; // F(n)
            
            while (index <= n) {
                result = first + second;
                first = second % 1234567;
                second = result % 1234567;
                index++;
            }
            answer = result % 1234567;
        }
        return answer;
    }
}
