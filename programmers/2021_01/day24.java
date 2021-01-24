import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // Arrays를 이용하여 평균을 내보았다.
        answer = Arrays.stream(arr).average().getAsDouble();
        
        return answer;
    }
}
