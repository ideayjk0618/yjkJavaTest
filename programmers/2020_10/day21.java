class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        if (n < 1 || n > 1000000) {
            return answer;
        } else if (m < 1 || m > 1000000) {
            return answer;
        }
        
        int mult = n * m;
        
        // 최대공약수 알고리즘 : 유클리드 호제법 이용.
        
        while (m > 0) {
            int tempM = m;
            m = n % m;
            n = tempM;
        }
        answer[0] = n;
        
        // 최소공배수 알고리즘 : 유클리드 호제법을 이용한 최대공약수의 결과 값을 이용하여 푼다.
        // 최소공배수 = 두 수의 곱 / 최대공약수
        answer[1] = mult / n;
        return answer;
    }
}
