class Solution {
    public int[] solution(long n) {
        int[] answer = {};

        // n > 10000000000 이러면 integer too large 에러나던데.. 흠..왜지
        // 10 ^ 10 도 10000000000잖아요..-0-?
         if (n > Math.pow(10, 10)) {
             return answer;
         } else {
             String strN = String.valueOf(n);
             int nLen = strN.length();
             answer = new int[nLen];
             String[] getArrN = strN.split("");
             int idx = nLen - 1;
             for (String getN : getArrN) {
                 answer[idx] = Integer.parseInt(getN);
                 idx--;
             }
         }
        return answer;
    }
}
