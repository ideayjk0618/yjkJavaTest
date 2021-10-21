class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한조건
        if (3 > n || 1000000 < n) {
            return answer;
        } else {
            n = n - 1;
            int remainder = 0;
            for (int i = 2; i <= n; i++) {
                remainder = n % i;
                if (0 == remainder) {
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}
