import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 배열 : priorities담을 배열
        ArrayList<String> priList = new ArrayList<>();
        // 내가 인쇄 할 문서번호
        String myNum = "";
        // ArrayList에 priorities를 넣는다.
        for (int i = 0; i < priorities.length; i++) {
            String strPri = String.valueOf(priorities[i]);
            // 내 위치의 값인 경우에는 A로 대체한다.
            if (location == i) {
                myNum = strPri;
                strPri = "A";
            }
            priList.add(strPri);
        }
        
        // 1번 반복문 : 첫번째 숫자
        for (int j = 0; j < priList.size(); j++) {
            String bef = priList.get(j);
            // 2번 반복문 : 첫번째 숫자 이외의 숫자들
            for (int z = j+1; z < priList.size(); z++) {
                String aft = priList.get(z);
                
                if ("A".equals(bef)) {
                    // A인경우 : 숫자로 치환
                    bef = myNum;
                    // bef < aft
                    if (bef.compareTo(aft) < 0) {
                        bef = "A";
                        priList.add(bef); // 맨마지막에 넣기
                        priList.remove(j); // 그리고 삭제하기
                        j = -1; // 초기화
                        break;
                    } else {
                        // 다시 A로 되돌린다.
                        bef = "A";
                    }
                } else if ("A".equals(aft)) {
                    aft = myNum; // 숫자로 치환
                    // bef < aft
                    if (bef.compareTo(aft) < 0) {
                        priList.add(bef); // 맨마지막에 넣기
                        priList.remove(j); // 삭제
                        j = -1; // 초기화
                        break;
                    }
                } else {
                    // A의 문자가 아닌경우:우선순위숫자 크기 비교
                    if (bef.compareTo(aft) < 0) {
                        priList.add(bef);
                        priList.remove(j);
                        j = -1;
                        break;
                    }
                }
            }
        }
        // ㄴ> 해당 반복문을 사용하면 예를 들면 9111A1 또는 A221 이런식으로 List에 들어가있음.
        
        int idx = 1; // 인덱스
        for (String getA : priList) {
            // A가 되는 애가 내가 출력할 위치
            if ("A".equals(getA)) {
                answer = idx;
                break;
            }
            idx++;
        }
        
        return answer;
    }
}
