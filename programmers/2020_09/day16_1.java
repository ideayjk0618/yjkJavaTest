class Solution {    
    public int solution(String s) {
        int answer = 0;
        
        // 에러처리
        if (s.length() < 0 || s.length() > 6) {
            return answer;
        } else {
            // parseInt는 음수도 인식한다.
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}
