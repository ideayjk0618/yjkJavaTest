class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 배열 a,b의 길이
        int aLen = a.length;
        int bLen = b.length;
        
        if (aLen != bLen) {
            return answer;
        } else if (1 > aLen || 1000 < aLen) {
            // a와 b의 길이가 같은 조건이라, a의 길이만 체크
            return answer;
        } else {
            for (int i = 0; i < a.length; i++) {
                int getA = a[i];
                int getB = b[i];
                
                // -1000 <= a,b <= 1000
                if (-1000 > getA || 1000 < getA) {
                    return answer;
                } else if (-1000 > getB || 1000 < getB) {
                    return answer;
                } else {
                    answer += getA * getB;
                }
            }
        }
        return answer;
    }
}
