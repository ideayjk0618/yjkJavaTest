// 힌트 :  에라토스테네스의 체 라는 소수를 판별하는 알고리즘을 사용하지 않으면 말장꽝이다.. 

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 에러처리
        if (n < 2 || n > 1000000) {
            return answer;
        } else {
            // 우선 배열[2]=2 부터 n번까지 모두 넣는다, 
            int[] arr = new int [n+1];
            for (int i = 2; i <= n; i++) {
                arr[i] = i;
            }
            
            for (int j = 2; j <= n; j++) {
                // ==0 이게 무슨 뜻이냐 하면, 내가 n의 배수의 값들을 다 0으로 바꿔줄거거덩 ^0^
                // 그래서 0이 된 값들은 배수체크도 안하고 지나가실거임.
                 if(arr[j] == 0) continue;
                
                // j+j는 j가2인경우, 그 배수 4부터 시작합니다.
                // 해당 2의 배수의 값들을 다 0으로 바꿔주고, z+j를 합니다.
                // 그 이유는 z(=4), j(=2)하면 또 현재 4의 2의 배수를 구할수있거든요
                // 그럼 6도 2의 배수니까 0가 되겠죠? 이런식으로 2의 배수를 구합니다.
                for (int z =  j + j; z <= n; z = z + j) {
                    arr[z] = 0; // 해당 계산된 배수들 다 0으로 바꿉니다.
                }
            }
            //이제 출력을 해볼게요, 출력은 0이 아닌것만 체크합니다.
            for (int result : arr) {
                if (result != 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
