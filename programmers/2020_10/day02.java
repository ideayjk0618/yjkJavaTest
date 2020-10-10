class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        
        if (x < -10000000 || x > 10000000) {
            return answer;
        } else if (n > 1000) {
            return answer;
        } else {
            // 배열 생성
            answer = new long [n];
            // x씩 증가할 값
            long plus = (long) x;
            // 계산후 결과 값
            long result = (long) x;
            for (int i = 0; i < n; i++) {
                answer[i] = result;
                result += plus;
            }
        }
        return answer;
    }
}

// 캐스팅을 미리하고, 밑에서 더해주는것이 런타임에러가 안나고 좋음, int x값에 계속 더해주면 int사이즈가 벗어날수 있어, long타입으로 변환후에 계산해주는것이 좋은방법이로다.
// 쉬우면서도 사람들이 int와 long의 구분없이 기본적으로 int로 써서 에러가 나는데 항상 문자열의 사이즈를 생각하며 타입을 골라쓰자!
