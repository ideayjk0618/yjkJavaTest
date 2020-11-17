import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        ArrayList<String> priList = new ArrayList<>();
        String myNum = "";
        for (int i = 0; i < priorities.length; i++) {
            String strPri = String.valueOf(priorities[i]);
            if (location == i) {
                myNum = strPri;
                strPri = "A";
            }
            priList.add(strPri);
        }
        
        for (int j = 0; j < priList.size(); j++) {
            String bef = priList.get(j);
            for (int z = j+1; z < priList.size(); z++) {
                String aft = priList.get(z);
                // System.out.print(bef +":"+ aft);
                if ("A".equals(bef)) {
                    bef = myNum;
                    if (bef.compareTo(aft) < 0) {
                        bef = "A";
                        priList.add(bef);
                        priList.remove(j);
                        j = -1;
                        break;
                    } else {
                        bef = "A";
                    }
                } else if ("A".equals(aft)) {
                    aft = myNum;
                    if (bef.compareTo(aft) < 0) {
                        priList.add(bef);
                        priList.remove(j);
                        j = -1;
                        break;
                    }
                } else {
                    if (bef.compareTo(aft) < 0) {
                        priList.add(bef);
                        priList.remove(j);
                        j = -1;
                        break;
                    }
                }
            }
        }
        int idx = 1;
        for (String getA : priList) {
            // System.out.print(getA);
            if ("A".equals(getA)) {
                answer = idx;
                break;
            }
            idx++;
        }
        
        return answer;
    }
}
