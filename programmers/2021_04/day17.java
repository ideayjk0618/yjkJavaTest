class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // absolutes의 길이
        int len = absolutes.length;
        
        // 파라메타의 사이즈가 서로 같지 않으면 서비스 종료
        if (len != signs.length) {
            return answer;
        }
        
        for (int i = 0; i < len; i++) {
            boolean sign = signs[i];
            if (sign) {
                // sign이 참이면, 양수
                answer += absolutes[i];
            } else {
                // 그렇지 않으면, 음수
                answer += (absolutes[i] * -1);
            }
        }
        
        return answer;
    }
}
