import java.util.ArrayList;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        // 무조건 짝수의 문자열이 아닌경우 짝지어 제거가 불가능하므로 종료.
        if (s.length() % 2 != 0) {
				return answer;
        } else {
            ArrayList<String> list = new ArrayList<>();
				String[] arrS = s.split("");
				for (String strS : arrS) {
					if (list.size() != 0) {
						String lastNum = list.get(list.size()-1);
            // 마지막에 들어간 값과 현재의 값을 비교한다.
						if (strS.equals(lastNum)) {
							list.remove(list.size()-1);
						} else {
							list.add(strS);
						}
					} else {
						list.add(strS);
					}
				}
            if (list.size() == 0) answer = 1;
        }
        return answer;
    }
}

//효율성이 안풀려서 파이썬의 힌트를 (ㅋㅋ)봤는데, 역시 무조건적으로 삭제보다, 마지막 삭제의 값과 현재의 값과 비교해서 삭제처리하는게 더 빠르다는것을 알았다.
