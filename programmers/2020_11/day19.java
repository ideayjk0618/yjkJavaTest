import java.util.Calendar;

class Solution {
    
    private int YEAR = 2016;
    
    public String solution(int a, int b) {
        String answer = "";
        
        // 캘린더클래스를 사용해서 날짜를 반환한다.
        // 캘린더는 인스턴스를 만들면 사용할수 있음.
        Calendar cal = Calendar.getInstance();
        
        // 년, 월, 일을 캘린더에 설정해준다.
        // month는 1월을 0으로 표현한다. 그래서 -1을 해준다.
        cal.set(YEAR, a-1, b);

        // 위에서 설정한 날짜를 통해서, 요일을 가져오면 숫자로 반환한다.
        // 일요일 : 1 ~ 토요일 : 7 로 표현한다.
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        switch (dayOfWeek) {
            case 1 : answer = "SUN";
                break;
            case 2 : answer = "MON";
                break;
            case 3 : answer = "TUE";
                break;
            case 4 : answer = "WED";
                break;
            case 5 : answer = "THU";
                break;
            case 6 : answer = "FRI";
                break;
            case 7 : answer = "SAT";
                break;
        }
        return answer;
    }
}
