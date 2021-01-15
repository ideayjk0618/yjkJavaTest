class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 연속한 자연수들로 표현
        // 예제에 +외에는 다른 표현이 없음: +만 허용함
        
        // 합계
        int sum = 0;
        // 시작점용 인덱스
        int idx = 0;
        // 반복문: 1부터 주어지는 n 까지 실행 (n을 만들기 위함으로 n이상은 필요가 없음)
        for (int i = 1; i <= n; i++) {
            // 합계에 i값 더한다
            sum += i;
            // n과 같은경우
            if (n == sum) {
                answer++;
                idx++;
                i = idx;
                sum = 0;
            } else if (n < sum) {
                // n보다 큰경우 (answer를 +1할 필요없이 값들을 초기화)
                idx++;
                i = idx;
                sum = 0;
            }
        }
        return answer;
    }
}
