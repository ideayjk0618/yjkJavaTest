import java.util.Calendar;

class Solution {
    
    //固定数字(年)：2016
    // 고정문자열(연) : 2016
    private int YEAR = 2016;
    
    public String solution(int a, int b) {
        String answer = "";
        
        // 에러처리エラー処理
        if (a < 0 || a > 12) {
            return answer;
        } else if (b < 0 || b > 31) {
            return answer;
        }
        
        // 캘린더 인스턴스 생성　カレンダーのインスタンスを生成
        Calendar cal = Calendar.getInstance();
        
        // 해당 년도 세팅　年を設定
        cal.set(Calendar.YEAR, YEAR);
        // 해당 월 세팅 (0부터 시작하므로 -1처리한다.)　月を設定(月は0から始まるから-1処理を追加する。)
        cal.set(Calendar.MONTH, a-1);
        // 해당 일 세팅　日を設定
        cal.set(Calendar.DATE, b);
        
        // getTime은 Date값으로 리턴시키기 때문에, String값으로 형변환한다.
        //カレンダーのgetTimeはDateにリタンするので、Stringに変換する。
        String getTime = cal.getTime() + "";
        // getTime의 출력의 3자리는 요일이 출력되기 때문에　getTimeは0~3まで曜日を出力する。
        // 0~3자리까지 출력한 값에서 전부 대문자로 변환한다.　0~3を出力して、大文字に変換してanswerに保存する。
        answer = getTime.substring(0,3).toUpperCase();
        
        return answer;
    }
}
