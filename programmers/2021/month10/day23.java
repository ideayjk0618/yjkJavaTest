import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        for (int win_num : win_nums) {
        	hashSet.add(win_num);
        }
        int zeroCount = 0;
        for (int lotto : lottos) {
        	if (0 == lotto) {
        		zeroCount++;
        	}
        	boolean contain = hashSet.contains(lotto);
        	if (contain) {
        		hashSet.remove(lotto);
        	}
        }
        if (6 == zeroCount) {
        	answer[0] = 1;
        	answer[1] = 6;
        } else {
        	int rest = 6 - hashSet.size();
            int high = 6 - (rest + zeroCount);
            int low = 6 - rest;
            answer[0] = (6 == high) ? 6 : (high + 1);
            answer[1] = (6 == low) ? 6 : (low + 1);
        }
        return answer;
    }
}
