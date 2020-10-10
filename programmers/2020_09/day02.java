import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // エラー処理
        if (participant.length < 0) {
            return answer;
        } else if (participant.length > 100000) {
            return answer;
        }
        if (completion.length == participant.length) {
            return answer;
        }
        
        // 参加者をHashMapに全部追加する。
        Map<Integer, String> hashMap = new HashMap();
        
        for (int i = 0; i < completion.length; i++) {
            hashMap.put(i, completion[i]);
        }
        
        // 参加者リストから完走者を検索する。
        for (int i = 0; i < participant.length; i++) {
            // 参加者リストから完走者がいれば、HashMapから削除する。
            //String aa = hashMap.values().toString();
            if (hashMap.containsValue(participant[i])) {
                 int resultKey = searchKey(hashMap, participant[i]);
                hashMap.put(resultKey, "0"); // 같으면 해당 값을 0으로 수정한다.
            } else {
                 return answer = participant[i];
            }
        }
        return answer;
    }
    
    public static int searchKey(Map<Integer, String> map, String searchValue) {
        for (int key : map.keySet()) {
            if (searchValue.equals(map.get(key))) {
                return key;
            }
        }
        return -1;
    }
}
