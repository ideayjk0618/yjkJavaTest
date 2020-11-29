import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한사항
        if (1000000 < n) {
            return answer;
        } else {
            // 2진수 변환
            String str_bi1 = Integer.toBinaryString(n);
            // 배열로 변환
            String[] arr_bi1 = str_bi1.split("");
            // 1의 갯수
            int count1 = 0;
            // 반복문1 : 1의 갯수가 몇개인지 체크
            for (String getBi1 : arr_bi1) {
                if ("1".equals(getBi1)) {
                    count1++;
                }
            }
            // 다음 숫자
            int nextNum = n + 1;
            int count2 = 0;
            while (count1 != count2) {
                // 다음 숫자를 2진수로 변경
                String str_bi2 = Integer.toBinaryString(nextNum);
                // 다음 숫자를 배열로 변환
                String[] arr_bi2 = str_bi2.split("");
                // 반복문2 : 1의 갯수 체크
                for (String getBi2 : arr_bi2) {
                    if ("1".equals(getBi2)) {
                        count2++;
                    }
                }
                // 같아질때 반복문에서 탈출한다.
                if (count1 == count2) {
                    break;
                }
                nextNum++;
                count2 = 0;
            }
            
            answer = nextNum;
        }
        
        return answer;
    }
}
