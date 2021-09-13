/**
    price : 놀이기구의 이용료
    money : 처음 가지고 있던 금액
    count : 놀이기구의 이용 횟수
*/
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        if (1 > price || 2500 < price) {
            return answer;
        } else if (1 > money || 1000000000L < money) {
            return answer;
        } else if (1 > count || 2500 < count) {
            return answer;
        } else {
            for (int i = 1; i <= count; i++) {
                answer += i * price;
            }
        }
        if (money < answer) {
            answer = answer - money;
        } else if (money >= answer) {
            answer = 0;
        }
        return answer;
    }
}
