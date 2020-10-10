class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열s의 길이
        int sLen = s.length();
        
        // 0 < s길이 < 101
        if (sLen < 1 || sLen >100) {
            return answer;
        } else if (sLen % 2 == 0) {
            // 짝수일때
            int num = sLen / 2;
            answer = s.substring(num-1, num+1);
        } else {
            // 홀수일때
            int num = sLen / 2;
            answer = s.substring(num, num+1);
        }
        return answer;
    }
}
