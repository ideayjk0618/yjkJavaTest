// 배열 쌓이는 순서가, 세로-왼쪽순이 아니라 가로-위순이라는것을 알고, 얼마나 어이가 없던지.. 내 시간...ㅠㅠ 문제읽고 이해하기가 너무 중요하다는것을 또 알았습니다..

import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        // board 길이
        int bLen = board.length;
        // 집어낸 숫자
        int getB = 0;
        
        for (int m : moves) {
            m = m - 1; // 보드 배열의 값은 0부터 시작하므로 -1를 해준다.
            for (int i = 0; i < bLen; i++) {
                getB = board[i][m];
                if (getB == 0) {
                    continue; // 0이면 비어 있는 곳이므로 통과한다.
                } else if (getB > 0) {
                    list.add(getB);
                    board[i][m] = 0; // 해당 위치의 숫자를 뽑아 냈기 때문에, 0(빈공간)으로 치환한다.
                    break;
                }
            }
        }
        int result = 0;
        for (int j = 0; j < list.size()-1; j++) {
            int bef = list.get(j);
            int aft = list.get(j+1);
            if (bef == aft) {
                result++;
                // 삭제하면 바로 list의 값이 하나 줄기 때문에, 같은 위치를 다시 삭제하면 j와 J+1의 값을 삭제한것과 같다.
                list.remove(j);
                list.remove(j);
                j = -1;
            }
        }
        answer = result * 2; // 한번에 두개의 인형이 없어지므로 2를 곱해준다.
        return answer;
    }
}
