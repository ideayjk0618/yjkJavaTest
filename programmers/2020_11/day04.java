import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        ArrayList<Integer> dayList = new ArrayList<>(); // 각 진행해야할 일수
		    ArrayList<Integer> result = new ArrayList<>(); // 배포할 기능의 수
		
		for (int i = 0; i < speeds.length; i++) {
    
			int time = 0; // 일수
			int getSp = speeds[i]; // 개발속도
			int restPro = 100 - progresses[i]; // 남은작업진도 (100-작업진도)
			int sumDay = 0; // 남은 작업 진도 일수 계산값
      
			while (restPro>=sumDay) {
				sumDay = sumDay + getSp; // 개발속도를 계속 더해서 직업진도 수 만큼 계속 반복한다. (예를 들면 70%남은 작업을 30%의 속도로 하면 30+30+30=90%의 오버되서 일해야하는 것도 찾을수 있음)
				time++;
				if (restPro == sumDay) { break; } // 같을때 멈춘다. (그래야 오버되는 값을 계산해서 쓸떼없이 계산을 하지 않는다.)
			}
      
			if (dayList.size() == 0) { // 0인경우에는 값을 무조건 넣는다.
				dayList.add(time);
				result.add(1);
			} else {
				int lastDay = dayList.get(dayList.size()-1); // 최근에 넣은 일수의 값을 출력
				int lastResult = result.get(result.size()-1); // 최근에 넣은 기능수의 값을 출력
        
				if (lastDay >= time) { // 마지막의 일수가 계산해온 일수의 값과 비교해서 마지막의 값보다 새로 계산한 일 수의 값이 작은 경우.
					//dayList.set(dayList.size()-1, lastDay-time); -> 일을 동시 진행 하기 때문에 앞의 일수에서 마지막 값에서 빼기 필요가 없다.
					lastResult++; // 배포할 기능의 수 +1를 한다.
					result.set(result.size()-1, lastResult); // 다시 마지막의 기능위치에 배포 기능 수를 수정한다.
				} else { // 새로 계산한 일 수의 값이 큰 경우.
					dayList.add(time); // 새롭게 값을 넣는다.
					result.add(1); // 새롭게 배포할 기능의 수를 새로이 1를 넣는다.
				}
			}
		}
		// System.out.println(result);
    //출력
        answer = new int[result.size()];
        for (int z = 0; z < result.size(); z++) {
            answer[z] = result.get(z);
        }
        
        return answer;
    }
}
