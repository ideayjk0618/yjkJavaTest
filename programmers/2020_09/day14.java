class Solution {
    
    // 고정 문자열 오른손잡이
    private String RIGTH = "right";
    // 고정 문자열 L
    private String STR_L = "L";
    // 고정 문자열 R
    private String STR_R = "R";
    
    String answer = "";
    
    // 왼손의 현재 위치
    int l_location = -1;
    // 오른손의 현재 위치
    int r_location = 10;
    
    public String solution(int[] numbers, String hand) {
        
        // number 크기 체크 0<number<1001
        if (numbers.length < 1) {
            return answer;
        } else if (numbers.length > 1000) {
            return answer;
        }
        // number 원소값 체크 
        for (int i : numbers) {
            if (i < 0) {
                return answer;
            } else if (i > 9) {
                return answer;
            }
        }

        
        for (int num : numbers) {
            switch (num) {
                case 1: l_location = 1;
                    answer = answer + STR_L;
                    break;
                case 4: l_location = 4;
                    answer = answer + STR_L;
                    break;
                case 7: l_location = 7;
                    answer = answer + STR_L;
                    break;
                case 3: r_location = 3;
                    answer = answer + STR_R;
                    break;
                case 6: r_location = 6;
                    answer = answer + STR_R;
                    break;
                case 9: r_location = 9;
                    answer = answer + STR_R;
                    break;
            }
            // 왼쪽 차이
            int l_dis = 0;
            // 오른쪽 차이
            int r_dis = 0;
            
            if (num == 2) {
                switch(l_location) {
                    case 1, 5: l_dis = 1;
                        break;
                    case 4, 8: l_dis = 2;
                        break;
                    case 7, 0, -1: l_dis = 3;
                        break;
                    case 2: l_dis = 0;
                        break;
                }
                switch(r_location) {
                    case 3, 5: r_dis = 1;
                        break;
                    case 6, 8: r_dis = 2;
                        break;
                    case 9, 0, 10: r_dis = 3;
                        break;
                    case 2: r_dis = 0;
                        break;
                }
                calcNum(l_dis, r_dis, num, hand);
            } else if (num == 5) {
                switch (l_location) {
                    case 4, 2, 8: l_dis = 1;
                        break;
                    case 1, 7, 0: l_dis = 2;
                        break;
                    case -1: l_dis = 3;
                        break;
                    case 5: l_dis = 0;
                        break;
                }
                switch (r_location) {
                    case 6, 2, 8: r_dis = 1;
                        break;
                    case 3, 9, 0: r_dis = 2;
                        break;
                    case 10: r_dis = 3;
                        break;
                    case 5: r_dis = 0;
                        break;
                }
                calcNum(l_dis, r_dis, num, hand);
            } else if (num == 8) {
                switch (l_location) {
                    case 7, 5, 0: l_dis = 1;
                        break;
                    case 4, 2, -1: l_dis = 2;
                        break;
                    case 1: l_dis = 3;
                        break;
                    case 8: l_dis = 0;
                        break;
                }
                switch (r_location) {
                    case 9, 5, 0: r_dis = 1;
                        break;
                    case 6, 2, 10: r_dis = 2;
                        break;
                    case 3: r_dis = 3;
                        break;
                    case 8: r_dis = 0;
                        break;
                }
                calcNum(l_dis, r_dis, num, hand);
            } else if (num == 0) {
                switch (l_location) {
                    case 8, -1: l_dis = 1;
                        break;
                    case 7,5: l_dis = 2;
                        break;
                    case 4,2: l_dis = 3;
                        break;
                    case 1: l_dis = 4;
                        break;
                    case 0: l_dis = 0;
                        break;
                }
                switch (r_location) {
                    case 8, 10: r_dis = 1;
                        break;
                    case 9,5: r_dis = 2;
                        break;
                    case 6,2: r_dis = 3;
                        break;
                    case 3: r_dis = 4;
                        break;
                    case 0: r_dis = 0;
                        break;
                }
                calcNum(l_dis, r_dis, num, hand);
            }
        }
        
        return answer;
    }
    
    public void calcNum (int l_dis, int r_dis, int num, String hand) {
        
        // 대소 관계에 오른쪽이 작으면, 오른쪽이 가깝다는 뜻
        if (l_dis > r_dis) {
            r_location = num;
            answer = answer + STR_R;
        } else if (l_dis < r_dis) {
            // 대소 관계에서 왼쪽이 작으면, 왼쪽이 가깝다는 뜻
            l_location = num;
            answer = answer + STR_L;
        } else {
            // 둘이 같은 경우 왼손잡이, 오른손잡이 체크
            if (hand.equals(RIGTH)) {
                r_location = num;
                answer = answer + STR_R;
            } else {
                l_location = num;
                answer = answer + STR_L;
            }
        }
    }
}
