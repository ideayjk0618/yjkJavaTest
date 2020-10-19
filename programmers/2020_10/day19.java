import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 제한조건
        if (n < 1 || n > 8000000000L) {
            return answer;
        } else {
            // split(cut문자)한자리씩 출력
            String[] arrN = String.valueOf(n).split("");
            // 오름차순
            Arrays.sort(arrN);
            
            String strN = "";
            for (String getStrN : arrN) {
                strN = getStrN + strN;
            }
            answer = Long.parseLong(strN);
        }
        return answer;
    }
}
