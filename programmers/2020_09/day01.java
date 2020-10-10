import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        if (numbers.length < 0) {
            return "0";
        } else if (numbers.length > 100000) {
            return "0";
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 1000) {
                    return "0";
                } else if (numbers[i] < 0) {
                    return "0";
                }
            }
            
             Arrays.sort(numbers);
            for (int i = numbers.length -1 ; i >=0 ; i --) {

                answer = answer + numbers[i];
            }
        }      
        return answer;
    }
}
