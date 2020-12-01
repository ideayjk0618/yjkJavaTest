import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // List 생성
        ArrayList<Integer> list = new ArrayList<>();
        // 배열의 길이가 1보다 큰 경우
        if (1 < arr.length) {
        	// 첫번째 값을 최소값으로 설정한다
        	int minNum = arr[0];
          // 반복문1 : 주어진 배열에서 최소값 찾기
        	for (int i = 1; i < arr.length; i++) {
        		int getNum = arr[i];
        		if (minNum > getNum) {
        			minNum = getNum;
        		}
        	}
        	// 찾은 최소값을 제외한 정수를 List에 추가한다
        	for (int getNum : arr) {
        		if (getNum != minNum) {
        			list.add(getNum);
        		}
        	}
        } else {
        	return answer = new int[] {-1};
        }
        // 배열 선언
        answer = new int[list.size()];
        // 선언한 배열에 List의 값을 넣는다.
        for (int j = 0; j < list.size(); j++) {
        	answer[j] = list.get(j);
        }
        
        return answer;
    }
}
