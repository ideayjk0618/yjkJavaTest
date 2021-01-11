import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        // 배열 생성
        ArrayList<String> list = new ArrayList<String>();
        
        // 에러처리
        if (strings.length < 1 || strings.length > 50) {
            return answer;
        } else {
            // 원소 에러처리
            for (String beS : strings) {
                if (beS.length() < n) {
                    return answer;
                } else if (beS.length() < 1 || beS.length() > 100) {
                    return answer;
                } else if (!beS.equals(beS.toLowerCase())) {
                    return answer;
                }
            }
            // 선택정렬 알고리즘 사용.
            for (int i = 0; i < strings.length-1; i++) {
                for (int j = i+1; j < strings.length; j++) {
                    // i배열값의 n번째 문자
                    char str1 = strings[i].charAt(n);
                    // j배열값의 n번째 문자
                    char str2 = strings[j].charAt(n);
                    
                    // char로 문자 비교 str1 > str2 의 의미는, str1보다 str2가 사전적으로 앞의 문자.
                    if (str1 > str2) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    } else if (str1 == str2) {
                        // 만약 둘의 문자가 같다면, 전체문자열을 보고 어느 문자가 사전적으로 앞섰는지 체크해야한다. a.compareTo(b)는 > 0 b가 사전적으로 앞의 문자열.
                        if (strings[i].compareTo(strings[j]) > 0) {
                            String temp2 = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp2;
                        }
                    }
                }
            }
        }        
        answer = new String[strings.length];
        int idx = 0;
        for (String s : strings) {
            answer[idx] = s;
            idx++;
        }
        return answer;
    }
}

//해당 코딩의 문제점은 지문을 제대로 인식하지 못한점. 특히 문자가 서로 같은경우, 해당 문자열끼리 비교가 필요했으나 그 부분이  빠져 정확성체크에 에러가 발생. (3~8, 10, 12번)
