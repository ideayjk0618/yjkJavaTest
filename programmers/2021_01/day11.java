import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 배열의 길이
        int strLen = strings.length;
        String[] answer = new String [strLen];
        
        // n번째 글자가 0인경우
        if (0 >= n) {
            // 사전식 배열
            Arrays.sort(strings);
            answer = strings.clone();
        } else {
            // n번째 글자가 0 이상인 경우

            for (int i = 0; i < strLen-1; i++) {
                // i번째 문자열
                String str1 = strings[i];
                // i+1번째 문자열
                String str2 = strings[i+1];
                // i번째 문자열의 n번째 char문자
                char char1 = str1.charAt(n);
                // i+1번째 문자열의 n번째 char문자
                char char2 = str2.charAt(n);
                // char문자의 대소비교 (숫자 대소비교와 같음)
                if (char1 > char2) {
                    // 앞의 문자가 더 큰경우, 서로 위치 변경
                	strings[i] = str2;
                	strings[i+1] = str1;
                    // i값 초기화
                	i = -1;
                } else if (char1 == char2) {
                    // 같은경우 문자열 사전식 크기 비교
                	if (str1.compareTo(str2) > 0) {
                        // 앞의 문자가 더 큰 경우, 서로 위치 변경
                		strings[i] = str2;
                		strings[i+1] = str1;
                        // i값 초기화
                		i = -1;
                	}
                }
            }
            answer = strings.clone();
        }
        return answer;
    }
}
