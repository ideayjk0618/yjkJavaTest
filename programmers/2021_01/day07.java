class Solution {
    public String solution(String s) {
        String answer = "";

        // 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
        if (0 >= s.length()) {
            return answer;
        } else {
            // 문자열 전체를 대문자로 변경
            s = s.toUpperCase();
            
            // 단어별로 짝홀수 인덱스 판단용
            int idx = 0;
            
            for (int i = 0; i < s.length(); i++) {
                // 문자열 자르기
                String getS = String.valueOf(s.charAt(i));
                // 공백이 아닌경우
                if (!(" ".equals(getS))) {
                    if (idx % 2 != 0) {
                        // 홀수번째는 소문자로 변경
                        answer += getS.toLowerCase();
                    } else {
                        answer += getS;
                    }
                    idx++;
                } else {
                    answer += getS;
                    idx = 0;
                }
            }
        }
        return answer;
    }
}
