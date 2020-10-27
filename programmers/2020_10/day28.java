import java.util.Arrays;

class Solution {
    
    /**
     *  @param  d   신청한 금액 배열
     *  @param  budget  예산
     *
     *  @return 지원 가능한 최대 부서의 수
    */
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 제한조건
        if (d.length < 1 || d.length > 100) {
            return answer;
        } else if (budget < 1 || budget > 10000000) {
            return answer;
        } else {
            // 신청 금액 배열 오름차순으로 정렬
            Arrays.sort(d);
            int sumD = 0;
            int teamCon = 0;
            for (int dNum : d) {
                if (dNum < 1 || dNum > 100000) {
                    return answer;
                } else {
                    sumD += dNum;
                    if (sumD <= budget) {
                        teamCon++;
                    }
                }
            }
            answer = teamCon;
        }        
        return answer;
    }
}
