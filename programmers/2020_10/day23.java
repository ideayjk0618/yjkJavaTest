class Solution {
    public int solution(int num) {
        int answer = 0;
        
        // 제한조건
        if (num < 1 || num > 8000000) {
            return answer = -1;
        } else {
            // 해당 계산의 결과값 result를 int로 준다면, 오버플로우로 인해 잘못된 값이 나온다. 그러므로 int보다 큰 long 또는 double형을 써주는것이 올바르다.
            long result = num; 
            while (result != 1) {
                if (answer >= 500) {
                    return answer = -1;
                }
                if (result % 2 != 0) {
                    // 홀수
                    result *= 3;
                    result++;
                    answer++;
                } else {
                    // 짝수
                    result /= 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}
