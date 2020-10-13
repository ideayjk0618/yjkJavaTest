class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한조건
        if (n < 1 || n > 100000000) {
            return answer;
        } else {
            int res = 0; // 나머지
            int spl = n; // 몫
            String result = "";
            while (spl > 0) {
                res = spl % 3;
                result += String.valueOf(res);
                spl = spl / 3;
            }
            // 3진수를 10진수로 변경하는 방법.
            answer = Integer.parseInt(result, 3);
        }
        return answer;
    }
}
