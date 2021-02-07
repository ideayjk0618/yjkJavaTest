class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 에라토스테네스의 체
        /*
            1. 2~n를 배열에 넣는다.
            2. 주어지는 수 n까지 반복한다.
            3. 해당 배열이 배수의 값이면 0으로 치환한다.
            3-1. 해당 배열 값이 0이면 다음으로 넘긴다.
        */
        int[] priArr = new int[n+1];
        // 배열에 넣기
        for (int i = 2; i <= n; i++) {
            priArr[i] = i;
        }
        // 배열의 idx용
        for (int j = 2; j <= n; j++) {
            // j배열 값이 0이면 skip
            if (priArr[j] == 0) {
                continue;
            }
            // j배수의 값 -> 0으로 치환
            for (int z = j+j; z <= n; z=j+z) {
                priArr[z] = 0;
            }
        }
        
        // 출력
        for (int pri : priArr) {
            if (0 != pri) {
                answer++;
            }
        }
        
        return answer;
    }
}
