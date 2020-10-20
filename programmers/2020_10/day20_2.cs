public class Solution {
    public string solution(int num) {
        string answer = "";
        if (num % 2 != 0)  {
            answer = "Odd";
        } else {
            answer = "Even";
        }
        return answer;
    }
}
