class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if (n < 1 || n > Math.pow(50, 13)) {
            return answer;
        } else {
            // 제곱근 값을 문자열로 변환.
            String strSqrt = String.valueOf(Math.sqrt(n));
            // 소숫점 위치
            int getPoint = strSqrt.indexOf(".");
            // 소숫점 앞까지만 출력.
            strSqrt = strSqrt.substring(0, getPoint);
            long longSqrt = Long.parseLong(strSqrt);
            if (n == Math.pow(longSqrt, 2)) { // 여기는 
                longSqrt++;
                // 실수 -> 정수로 형변환
                answer = (long)Math.pow(longSqrt, 2);
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
