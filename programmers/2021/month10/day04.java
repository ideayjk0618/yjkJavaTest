import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sizes.length; i++) {
        	int getNum1 = 0;
        	int getNum2 = 0;
        	getNum1 = sizes[i][0];
        	for (int j = 0; j < sizes[i].length; j++) {
        		getNum2 = sizes[i][j];
        	}
        	if (getNum1 > getNum2) {
        		list1.add(getNum1);
        		list2.add(getNum2);
        	} else {
        		list1.add(getNum2);
        		list2.add(getNum1);
        	}
        }
        list1.sort(Comparator.naturalOrder());
        Collections.sort(list2);
        int getLastNum1 = list1.get(list1.size() - 1);
        int getLastNum2 = list2.get(list2.size() - 1);
        answer = getLastNum1 * getLastNum2;
        return answer;
    }
}
