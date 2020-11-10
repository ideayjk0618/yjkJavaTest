import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean flag = false;
        // 오름차순
        Arrays.sort(people);
        
        // 효율성을 위한, 사람이 1명인경우 종료. --> 1도 반영 x
        if (people.length == 1) {
            return answer = 1;
        }
        
        for (int i = 0; i < people.length; i++) {
            int bef = people[i];
            if (bef != 0) {
                flag = false;
                int next = people.length - 1;
                while (next >= i) {
                    int aft = people[next];
                    if (aft != 0) {
                        int sum = bef + aft;
                        if (sum <= limit) {
                            answer++;
                            people[i] = 0;
                            people[next] = 0;
                            flag = true;
                            break;
                        }
                    }
                    next--;
                }
                if (!flag) {
                    answer++;
                }
            }
        }       
        return answer;
    }
}
