import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        // 힌트) 경우의 수 : 순열 이용 https://bcp0109.tistory.com/14
        // 순서 없이 n 개중에서 r 개를 뽑는 경우
        
        int n = numbers.length(); // 총 갯수
        int r = numbers.length(); // 뽑을 갯수
        
        // 숫자배열로 만든다
        String[] number = numbers.split("");
        int[] arr = new int[number.length];
        for (int a = 0; a < number.length; a++) {
            arr[a] = Integer.parseInt(number[a]);
        }
        
        int idx = 0;
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (idx < n) {
            hs = permutation(arr, 0, n, r);
            for (int intHS : hs) {
                if (!(list.contains(intHS))) {
                    list.add(intHS);
                }
            }
            r--;
            idx++;
        }
        
        // 소수 찾기
        for (int j = 0; j < list.size(); j++) {
            int getList = list.get(j);
            if (getList > 1) {
                for (int i = 2; i < getList; i++) {
                    if (getList % i == 0) {
                        // 나머지가 0이되면 0으로 치환하고 break
                        list.set(j, 0);
                        break;
                    }
                }
            }
        }
        for (int getNum : list) {
            if (getNum > 1) {
                answer ++;
            }
        }
        
        return answer;
    }
    
    // 경우의 수(순열이용) 
    /**
        depth 를 기준 인덱스로 하여 depth 보다 인덱스가 작은 값들은 그대로 고정하고
        depth 보다 인덱스가 큰 값들만 가지고 다시 swap 을 진행
    **/
    static HashSet<Integer> permutation(int[] arr, int depth, int n, int r) {
        HashSet<Integer> resultPer = new HashSet<>();
        if (depth == r) {
            String strPer = print(arr, r);
            resultPer.add(Integer.parseInt(strPer));
            return resultPer;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            // 재귀를 사용하여 출력되는 값을 다시 hashset에 넣어준다
            HashSet<Integer> resultPer2 = permutation(arr, depth + 1, n, r);
            for (int res2 : resultPer2) {
                resultPer.add(res2);
            }
            swap(arr, depth, i);
        }
        return resultPer;
    }
    //  배열들의 값을 직접 바꾸는 방법
    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    
    // 배열을 문자열로 출력
    static String print(int[] arr, int r) {
        String rslPrint = "";
        for (int i = 0; i < r; i++) {
            rslPrint += arr[i];
        }
        return rslPrint;
    }
}
