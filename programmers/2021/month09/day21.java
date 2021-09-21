import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i <= 9; i++) {
            answer += i;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        answer -= sum;
        
        return answer;
    }
}
