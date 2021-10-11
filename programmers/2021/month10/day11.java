import java.util.HashMap;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = left; i <= right; i++) {
			map.put(i, (euclidean(i)));
		}
		for (int getKey : map.keySet()) {
			int getValue = map.get(getKey);
			if (getValue % 2 != 0) {
				answer -= getKey;
			} else {
				answer += getKey;
			}
		}
		return answer;
    }
    public static int euclidean(int number) {
		int count = 0;
		for (int j = 1; j <= number; j++) {
			int r = number % j;
			if (r == 0) {
				count++;
			}
		}
		return count;
	}
}
