import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 내가 골라야하는 수 = 전체 / 2
        int myMon = nums.length / 2;
        // HashSet 생성
        HashSet<Integer> hs = new HashSet<>();
        // 폰켓몬을 hashSet에 추가
        for (int num : nums) {
            hs.add(num);
        }
        
        // 중복제거한 배열이 골라야하는 수 보다 작거나 같은 경우
        if (hs.size() <= myMon) {
            // 중복제거한 배열의 사이즈를 반환
            answer = hs.size();
        } else {
            // 중복제거한 배열의 크기가 골라야 하는 수보다 큰 경우 골라야하는 수로 반환 
            answer = myMon;
        }
        
        return answer;
    }
}
