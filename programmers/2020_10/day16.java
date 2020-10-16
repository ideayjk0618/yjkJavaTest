class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        // 제한조건
        if (x < 1 || x > 10000) {
            return answer;
        } else if (x >= 1 && x <= 10) {
            answer = true;
        } else {
            // 숫자 -> 문자
            String strX = String.valueOf(x);
            // 배열 생성
            int[] arrX = new int[strX.length()];
            
            for (int i = 0; i < strX.length(); i++) {
                // 한자리씩 문자 취득 -> 숫자로 형변환 -> 배열
                arrX[i] = Integer.parseInt(strX.substring(i, i+1));
            }
            // 자릿수의 합
            int allX = 0;
            for (int intX : arrX) {
                allX += intX;
            }
            // 나누어 떨어지지 않느다면 F
            if (x % allX != 0) {
                answer = false;
            } else {
                answer = true;
            }
        }
        return answer;
    }
}
