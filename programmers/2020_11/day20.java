class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        // 제한조건
        if (numbers.length < 2 || numbers.length > 20) {
            return answer;
        } else if (target < 1 || target > 1000) {
            return answer;
        } else {
            for (int number : numbers) {
                if (number < 1 || number > 50) {
                    return answer;
                }
            }
        }
        
        // DFS 풀이
        // 재귀로 모든 경우의 수(더하고, 빼고) 로 다 넣어서 구한다.
        answer += searchNode(1, numbers[0], numbers, target); // 더하고
        answer += searchNode(1, -(numbers[0]), numbers, target);  // 빼고
        
        return answer;
    }
    /**
     *  @param  index 배열 위치
     *  @param  sum 배열들의 합
     *  @param  numbers 배열
     *  @param  target  원하는 합
     *
     *  @return sum이 target의 값과 같을때 answer+1한 결과값
     */
    public int searchNode (int index, int sum, int[] numbers, int target) {
        int answer = 0;
        
        // DFS(깊이 우선 탐색)으로 배열의 index를 높여서 numbers의 모든 숫자를 순회한다.
        // 재귀를 사용했는데 index가 number.length 와 같아질 때를 탈출조건으로 삼는다.
        // 탈출하기 전, 배열의 숫자의 합 sum이 target과 같다면 answer에 1을 더해준다.
        if (index == numbers.length) { // 탈출조건
            if (sum == target) { // 같아질때
                answer++; // answer에 +1
            }
            return answer; // 탈출한다.
        }
        /**
        searchNode 함수 안에서 searchNode를 다시 부를 때, 단계를 높여 ‘index+1’,‘sum + numbers[index]’ 로 *깊이*를 추가한다.
        이때, index에는 ‘+1’ 한 것과 달리 numbers는 그대로 index 번째를 더해주는데,
        이것은 index가 ‘ 1 ~ numbers.length 로 번호를 매기고 (탈출할때 index이 numbers길이가 같을때 탈출함),
        배열은 ‘0~ numbers.iength -1’ 로 번호를 매기기 때문에 (배열의 첫번째의 값은 0부터 시작) 1씩 차이가 나기 때문이다.
        **/
        answer += searchNode(index+1, sum+numbers[index], numbers, target);
        answer += searchNode(index+1, sum-numbers[index], numbers, target);
        
        return answer;
    }
}
