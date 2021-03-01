class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 전체 대문자
        s = s.toUpperCase();
        // 문자열 인덱스
        int idx = 0;
        // 반복문 : 문자열 전체 확인용
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            // 공백의 아스키코드 : 32
            if (32 != sChar) {
                String sString = String.valueOf(sChar);
                if (idx % 2 != 0) {
                    answer += sString.toLowerCase();
                } else {
                    answer += sString;
                }
                idx++;
            } else {
                answer += String.valueOf(sChar);
                idx = 0;
            }
        }
        
        return answer;
    }
}
