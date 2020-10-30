import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        // 제한조건
        if (n < 2 || n > 16) {
            return answer;
        } else if (t <= 0 || t > 1000) {
            return answer;
        } else if (m < 2 || m > 100) {
            return answer;
        } else if (p < 1 || p > m) {
            return answer;
        } else {
            // 해당 n의 진수로 0부터 값 변환 -> list에 저장하기
        
            // n진수 결과 저장할 리스트 선언
            ArrayList<String> remList = new ArrayList<>();

            // 총 구할 갯수 = 갯수 * 인원수
            int allT = t * m;
            int rem = 0; // 나머지
            remList.add(String.valueOf(0)); // 0 값을 추가

            for (int i = 1; remList.size() < allT; i ++) {
                int quo = i; // 몫
                ArrayList<String> numList = new ArrayList<>();

                while (quo > 0) {
                    rem = quo % n; // 계산 후 나머지
                    String strRem = String.valueOf(rem);
                    switch (rem) {
                        case 10 : strRem = "A";
                            break;
                        case 11 : strRem = "B";
                            break;
                        case 12 : strRem = "C";
                            break;
                        case 13 : strRem = "D";
                            break;
                        case 14 : strRem = "E";
                            break;
                        case 15 : strRem = "F";
                            break;
                    }
                    numList.add(strRem);
                    quo = quo / n; // 몫
                }
                for (int z = numList.size()-1; z >= 0; z--) {
                    String getNum = numList.get(z);
                    remList.add(getNum);
                }
            }
            // 자기 차례 -> 결과값
            int idx = 0;
            for (int j = 0; j < allT; j++) {
                idx++;
                if (idx == p) {
                    answer += remList.get(j); // 결과에 값을 추가
                }
                if (idx == m) {
                    idx = 0;
                }
            }
        }

        return answer;
    }
}
