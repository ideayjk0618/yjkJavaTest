class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한사항
        if (1000000 < n) {
            return answer;
        } else {
            // 2진수 변환
            String str_bi1 = Integer.toBinaryString(n);
            // 1의 갯수
            int count1 = 0;
            // 반복문1: 현재 n(2)이 1이 몇개있는지 찾는다.
            for (int i = 0; i < str_bi1.length(); i++) {
                if ('1' == str_bi1.charAt(i)) {
                    count1++;
                }
            }
            
            // 다음 숫자
            int nextNum = n + 1;
            // 1의 갯수
            int count2 = 0;
            // 반복문2: 조건1이 n보다 크다고했으니 다음숫자 > n로 조건을 둔다.
            while (nextNum > n) {
                // 다음 숫자를 2진수로 변경
                String str_bi2 = Integer.toBinaryString(nextNum);
                // 반복문3: n+1(2)의 1의 갯수를 센다.
                for (int j = 0; j < str_bi2.length(); j++) {
                    if ('1' == str_bi2.charAt(j)) {
                        count2++;
                    }
                }
                // 1의 갯수가 같으면 서비스를 종료한다.
                if (count1 == count2) {
                    return nextNum;
                }
                nextNum++;
                count2 = 0;
            }
        }
        return answer;
    }
}
