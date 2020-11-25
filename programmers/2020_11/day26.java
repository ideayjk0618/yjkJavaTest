import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 제한조건
        if (1 > numbers.length || 100000 < numbers.length) {
            return answer;
        } else {
            // 오름차순 정렬
            Arrays.sort(numbers);
            // 오름차순 정렬한 값으로 제한조건을 체크한다. (맨앞의 값은 제일 작은수므로 0보다 작은지 체크, 맨뒤의 갚은 제일 큰수므로 1000보다 큰지 체크)
            if (0 > numbers[0] || 1000 < numbers[numbers.length-1]) {
                return answer;
            } else {
                // 힌트 : 사전식 정렬
                // 사전식 정렬을 하기위해 Collections를 이용할 예정이므로 ArrayList에 값을 넣어준다.
                // 힌트 : 원소가 전부 0일때 0으로 출력되야함. (11번케이스)
                // 이때 원소에 0이 몇개 있는지 체크해서, 전체배열의 사이즈만큼 있으면 0으로 리턴하고 서비스를 종료한다.
                ArrayList<String> arrNum = new ArrayList<>();
                int zeroCon = 0;
                for (int number : numbers) {
                    if (number == 0) {
                        zeroCon++;
                    }
                    arrNum.add(String.valueOf(number));
                }
                if (zeroCon == arrNum.size()) {
                    return answer = "0";
                }
                
                // 비교할때 3,30인경우 -> 303 이 큰지 330 이 큰지 비교해서 왼쪽이크면 앞뒤를 바꿉니다. (힌트)
                Collections.sort(arrNum, (num1, num2) -> (num2+num1).compareTo(num1+num2));
                for (String num : arrNum) {
                    answer += num;
                }
            }
        }
        return answer;
    }
}
