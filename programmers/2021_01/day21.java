import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        // 길이가 같은 배열 A,B
        if (A.length != B.length) {
            return answer;
        }

        // A와 B 둘다 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 큰값에서 작은값으로 이동하기 위한 B의 인덱스
        int j = B.length - 1;
        // 반복문: A의 길이만큼 반복
        for (int i = 0; i < A.length; i++) {
            // 누적된 값 = A값 * B값
            answer += A[i] * B[j];
            // j인덱스 -> 0
            j--;
        }
        return answer;
    }
}
