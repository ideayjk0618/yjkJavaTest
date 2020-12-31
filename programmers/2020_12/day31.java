public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한사항
        if (100000000 < n) {
            return answer;
        } else {
            while (n > 0) {
                // 나머지
                int rem = n % 10;
                // 나머지값을 결과에 더하기
                answer += rem;
                // 몫 나누기
                n = n / 10;
            }
        }

        return answer;
    }
}
