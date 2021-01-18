import java.util.ArrayList;

class Solution {
    
    private static String STR_L = "L";
    private static String STR_R = "R";
    private static String LEFT = "left";
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 12;
        int right = 12;
        ArrayList<String> numList = new ArrayList<>();
        for (int number : numbers) {
            switch (number) {
                case 1, 4, 7 :
                    numList.add(STR_L);
                    break;
                case 3, 6, 9:
                    numList.add(STR_R);
                    break;
                case 0:
                    numList.add("11");
                    break;
                default :
                    numList.add(String.valueOf(number));
                    break;
            }
        }
        
        for (int i = 0; i < numList.size(); i++) {
            String getNum = numList.get(i);
            if (STR_L.equals(getNum)) {
                answer += STR_L;
                left = numbers[i];
            } else if (STR_R.equals(getNum)) {
                answer += STR_R;
                right = numbers[i];
                if (right == 3) {
                    right = 1;
                } else if (right == 6) {
                    right = 4;
                } else {
                    right = 7;
                }
            } else {
                if (i > 0) {
                    int num = Integer.parseInt(numList.get(i));
                    int l = Math.abs(left - num);
                    int r = Math.abs(right - num);                    
                    
                    l = check2580(left, l, num);
                    r = check2580(right, r, num);
                    
                    // System.out.println(num+";"+left +":"+ right);
                    if (l > r) {
                        answer += STR_R;
                        right = num;
                    } else if (l < r) {
                        answer += STR_L;
                        left = num;
                    } else if (l == r) {
                        if (hand.equals(LEFT)) {
                            answer += STR_L;
                            left = num;
                        } else {
                            answer += STR_R;
                            right = num;
                        }
                    }
                } else {
                    if (hand.equals(LEFT)) {
                        answer += STR_L;
                    } else {
                        answer += STR_R;
                    }
                }
            }
        }        
        return answer;
    }
    
    public int check2580 (int hands, int location, int num) {
        int lo = location;
        switch (hands) {
            case 2 :
                if (num == 5) {
                    lo = 1;
                } else if (num == 8) {
                    lo = 2;
                } else if (num == 11) {
                    lo = 3;
                }
                break;
            case 5 :
                if (num == 2 || num == 8) {
                    lo = 1;
                } else if (num == 11) {
                    lo = 2;
                }
                break;
            case 8 :
                if (num == 2) {
                    lo = 2;
                } else if (num == 8 || num == 11) {
                    lo = 1;
                }
                break;
            case 11 :
                if (num == 8) {
                    lo = 1;
                } else if (num == 5) {
                    lo = 2;
                } else if (num == 2) {
                    lo = 3;
                }
                break;
        }
        return lo;
    }
}
