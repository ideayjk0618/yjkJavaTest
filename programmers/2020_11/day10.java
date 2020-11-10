import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean flag = false;
        // 오름차순
        Arrays.sort(people);
        
        // 효율성을 위한, 사람이 1명인경우 종료.
        if (people.length == 1) {
            return answer = 1;
        }
        
        for (int i = 0; i < people.length; i++) {
            flag = false;
            int bef = people[i];
            // System.out.print(bef);
            if (bef != 0) {
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
        }
        return answer;
    }
}
