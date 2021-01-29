import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int len = nums.length;
        
        // 제한사항
        if (3 > len || 50 < len) {
            return answer;
        } else {
            for (int num : nums) {
                if (1 > num || 1000 < num) {
                    return answer;
                }
            }
        }
        // 제한 조건에 위배되지 않으면, answer의 초기값을 0으로 설정
        answer = 0;
        // 정렬
        Arrays.sort(nums);
        // 배열 복제
        int[] nums2 = nums.clone();
        int[] nums3 = nums.clone();
        // 각 배열에서 가져올 변수 초기화
        int num1 = 0, num2 = 0, num3 = 0;
        
        for (int i = 0; i < len; i++) {
            num1 = nums[i];
            for (int j = 0; j < len; j++) {
                // j가 i보다 큰값만 선택
                if (i < j) {
                    num2 = nums2[j];
                }
                for (int k = 0; k < len; k++) {
                    // i보다 j가 커야하며, k가 i와 j보다 큰값을 선택
                    if (i < j && i < k && j < k) {
                        num3 = nums3[k];
                        // 합계
                        int sum = num1 + num2 + num3;
                        // 소수판별
                        boolean chkPrim = primeNumber(sum);
                        // 소수가 아닌경우
                        if (!chkPrim) {
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
    // 소수 판별
    public boolean primeNumber (int sum) {
        boolean pCheck = false;
        for (int p = 2; p < sum; p++) {
            if (sum % p == 0) {
                // 소수가 아닌경우
                pCheck = true;
                break;
            }
        }
        return pCheck;
    }
}
