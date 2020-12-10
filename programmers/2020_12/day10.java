class Solution {
    
    private String STR_MINUS = "-";
    public int solution(String s) {
        int answer = 0;
        
        // 제한조건
        if (1 > s.length() || 5 < s.length()) {
            return answer;
        } else {
            // 부호를 체크
            String getSign = s.substring(0,1);
            // 마이너스 부호인경우
            if (STR_MINUS.equals(getSign)) {
                // 부호 이후의 문자만 출력
                int absNum =Integer.parseInt(s.substring(1));
                // -1를 곱한다
                answer = absNum * (-1);
            } else {
                // 양수인경우 문자열 전체를 숫자로 변환한다
                answer = Integer.parseInt(s);
            }
        }
        return answer;
    }
}
