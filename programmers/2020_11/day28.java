import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        // 제한조건
        if (1 > arr.length) {
            return answer;
        } else {
            // 0으로 나누어 떨어지지 않은 수에 대한 카운트
            int noZero = 0;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                // 나누어 떨어지지 않는 경우, 해당 위치의 값을 0으로 수정한다.
                if (num % divisor != 0) {
                    arr[i] = 0;
                    noZero++;
                }
            }
            // 0으로 나누어 떨어지지 않은 카운트 == 배열의 길이와 같으면, -1로 리턴하고 서비스를 종료한다.
            if (noZero == arr.length) {
                return answer = new int[] {-1};
            } else {
                //answer의 인덱스
                int index = 0;
                // answer 선언
                answer = new int [arr.length - noZero];
                for (int j = 0; j < arr.length; j++) {
                    int num = arr[j];
                    // 0이 아닌 경우에만 배열에 넣는다.
                    if (0 != num) {
                        answer[index] = num;
                        index++;
                    }
                }
                // answer 배열을 오름차순으로 정렬한다.
                Arrays.sort(answer);
            }
        }
        return answer;
    }
}
