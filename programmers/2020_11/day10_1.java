import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0; // 인덱스 0~
        int next = people.length - 1; // 인덱스 마지막 ~ 0
        
        // 오름차순
        Arrays.sort(people);
        
        // 반복: 0(왼쪽끝)과 people.length-1(오른쪽끝) 끼리 비교
        while (idx <= next) {
            // 왼쪽끝
            int left = people[idx];
            // 오른쪽끝
            int right = people[next];
            // 더한 값
            int sum = left + right;
            // 한계를 넘지 않는다.
            if (sum <= limit) {
                // 보트를 보내지말고 다음(앞번)애를 기다린다.
                idx++;
            }
            // 보트에 탔다.
            // 한계 넘으면 그냥 보트탄애 보낸다.
            answer++;
            // 다음 번 끝번 애로 데려온다.
            next--;
            // System.out.print(sum +":"+idx+":"+next+":"+answer);
        }
        
        return answer;
    }
}
