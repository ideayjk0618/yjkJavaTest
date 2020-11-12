class Solution {
    
    // 고정 문자열 : Kim, 김서방은 , 에 있다
    private String KIM = "Kim";
    private String STR_1 = "김서방은 ";
    private String STR_2 = "에 있다";
    
    public String solution(String[] seoul) {
        String answer = "";
        
        // 인덱스: 0 ~
        int idx = 0;
        // 반복문: seoul배열에 들어있는 만큼 반복
        for (String name : seoul) {
            // Kim과 같은 문자열이 있는 경우
            if (KIM.equals(name)) {
                // 결과 = 문자열1 + 인덱스 + 문자열2
                answer = STR_1 + idx + STR_2;
                // 해당 반복문에서 탈출한다.
                break;
            }
            // 인덱스 = +1
            idx++;
        }
        return answer;
    }
}
