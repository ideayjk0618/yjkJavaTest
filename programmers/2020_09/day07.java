class Solution {
    
    // 고정문자열 固定文字列
    private char STR_Y = 'Y';
    private char STR_P = 'P';
    
    boolean solution(String s) {
        boolean answer = true;

        // 에러처리　エラー処理
        if (s.length() > 50) {
            return answer;
        } else if (s.length() <= 0) {
            return answer;
        }
        
        int resultNum = 0;
        
        for(char c : s.toCharArray()) {
            if (Character.isDigit(c) == false) {      
                // 대문자Y와 대문자화시킨 문자열과 비교
                if(STR_Y == Character.toUpperCase(c)) {
                    // 같으면 +1
                    resultNum++;
                } else if (STR_P == Character.toUpperCase(c)) {
                // P와 비교후 같으면 -1
                    resultNum--;
                }
            }
        }
        
        // 해당 값이 0인경우 해당 값을 참으로 반환
        if (resultNum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
