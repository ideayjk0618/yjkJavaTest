class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        if (arr.length < 1 || arr.length > 100) {
            return answer;
        } else {
            // arr의 전체값 더한 결과값.
            double avr = 0;
            
            for (int arrInt : arr) {
                if (arrInt < -10000 || arrInt > 10000) {
                    return answer;
                } else {
                    // 배열의 값을 모두 더하기.
                    avr += arrInt;
                    // 더한 값에, arr사이즈만큼 나누기.
                    answer = avr / arr.length;
                }
            }
        }
        return answer;
    }
}
