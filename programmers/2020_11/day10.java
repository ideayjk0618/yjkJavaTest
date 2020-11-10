import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean flag = false;
        // 오름차순
        Arrays.sort(people);
        
        for (int i = 0; i < people.length; i++) {
            int bef = people[i];
            int next = people.length - 1;
            while (next > 0) {
                int aft = people[next];
                if (aft == 0) {
                    next--;
                } else {
                    int sum = bef + aft;
                    if (sum > limit) {
                        next--;
                    } else if (sum <= limit) {
                        answer++;
                        people[i] = 0;
                        people[next] = 0;
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                answer++;
            }
        }
        
        return answer;
    }
}
