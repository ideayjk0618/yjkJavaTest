package javaTest_2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;

public class day04_10 {

	public static void main(String[] args) {
		String s = "";
		s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
//		s = "{{123}}";
		int[] result = solution(s);
		for (int result2 : result) {
			System.out.println("result: " + result2);
		}
	}

	/**
	 * @param string
	 * @return int[]
	 */
	public static int[] solution(String s) {
		int[] answer = {};
    
		if (5 > s.length() || 1000000 < s.length()) {
			return answer;
		}
    
		// 불필요한 {}, 제거
		s = s.replace(",{", "");
		s = s.replace("{{", "");
		// 튜플당 배열로 나누기
		String[] sArray = s.split("}");
		// 총 튜플 개수
		int sArrayLen = sArray.length;
		
		answer = new int[sArrayLen];
		HashMap<Integer, List<Integer>> sHm = new HashMap<>();
		// Map에 튜플 넣기
		for (int i = 0; i < sArrayLen; i++) {
			String[] getArrS = sArray[i].split(",");
			int getSLen = getArrS.length;
			ArrayList<Integer> list = new ArrayList<>();
			for (String getS : getArrS) {
				list.add(Integer.parseInt(getS));
			}
			sHm.put(getSLen, list);
		}
		
		LinkedHashSet<Integer> valueHS = new LinkedHashSet<>();
		for (Entry<Integer, List<Integer>> entry : sHm.entrySet()) {
			List<Integer> valueList = entry.getValue();
			for (int value : valueList) {
				valueHS.add(value);
			}
		}
		int idx = 0;
		for (int num : valueHS) {
			answer[idx] = num;
			idx++;
		}

		return answer;
	}

}
