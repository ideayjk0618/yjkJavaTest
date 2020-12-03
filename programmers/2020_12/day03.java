class Solution {
    public String solution(int n) {
        String answer = "";
        // 힌트 : 3진법으로 변환하는 방식, 3으로 나누어 떨어지는 숫자는 몫을 -1해서 나눠 진행하는 방식
        
        int rem = 0;
        if (500000000 < n) {
            return answer;
        }
        // String은 불변이기 때문에 String을 자주 조작하면 효율적이지 않게 된다.
        // String이 계속 수정되어야 한다면 StringBuffer나 StringBuilder를 사용해야 한다.        
        StringBuffer result = new StringBuffer();
        
        while (n > 0) {
            rem = n % 3;
            if (rem == 0) {
                rem = 4;
                n = (n / 3) - 1;
            } else {
                n = n / 3;
            }
            result.insert(0, rem);
        }
        return answer = result.toString();
    }
}
