class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 에러처리
        if (n < 0 || n > 3000) {
            return answer;
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}
