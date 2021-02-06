class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n == 2) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        for (int j = 4; j <= n; j++) {
            boolean resultPri = chkPri(j);
            if (!resultPri) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean chkPri (int m) {
        boolean chk = false;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                chk = true;
                break;
            }
        }
        return chk;
    }
}
