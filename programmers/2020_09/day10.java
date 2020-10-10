class Solution {
    
    // 고정값
    // 문자열"수"
    private String STR_SU = "수";
    // 문자열 "박"
    private String STR_PARK = "박";
    
    public String solution(int n) {
        String answer = "";
        
        // 에러처리
        // 10000이상인 경우에는 종료
        if (n > 10000) {
            return answer;
        } else if (n == 0) {
            // 0인 경우에는 종료
            return answer;
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer = answer + STR_PARK;
                } else {
                    answer = answer + STR_SU;
                }
            }
        }        
        return answer;
    }
}
