public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double result = 0;
        
        for (int i = 0 ; i < arr.Length; i++) {
            result += arr[i];
        }
        
        answer = result / arr.Length;
        
        return answer;
    }
}
