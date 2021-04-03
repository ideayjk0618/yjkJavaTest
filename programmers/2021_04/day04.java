import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        // 문자열: 0
		final String STR_ZERO = "0";
		
        int[] answer = new int[2];
        
        // 제한조건: 1 <= s길이 <= 150000
        if (1 > s.length() || 150000 < s.length()) {
        	return answer;
        } else {
        	ArrayList<String> list = new ArrayList<>();
        	
        	// 제한조건: 문자열에 1이 1개이상 존재
        	String[] splitS = s.split("");
        	int sum = 0;
        	for (String str : splitS) {
        		sum += Integer.parseInt(str);
        		list.add(str);
        	}
        	
        	if (1 > sum) {
        		return answer;
        	} else {
        		int times = list.size();
        		// 반복문: 1이될때까지 반복
        		while (1 < times) {
        			String[] number = {};
        			for (int i = 0; i < list.size(); i++) {
        				String getNum = list.get(i);
        				// 0인 경우
        				if (STR_ZERO.equals(getNum)) {
        					// 제거된 모든 0의 개수 +1
        					answer[1] += 1;
        					// 0을 제거
        					list.remove(i);
        					i = i - 1;
        				}
        			}
        			// 0 제거 후 길이
        			times = list.size();
        			// 이진수 변환
        			number = Integer.toBinaryString(times).split("");
        			list = new ArrayList<>();
        			for (String n : number) {
        				// 변환한 이진수를 한자리씩 list에 저장
        				list.add(n);
        			}
        			// 이진 변환의 횟수
        			answer[0] += 1;
        		}
        	}
        }
        return answer;
    }
}
