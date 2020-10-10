import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 固定文字列：＊（アスタリスク）
        String AST = "*";

        if (a > 1000 || b > 1000) {
            System.out.print("");
        } else {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a-1; j++) {
                    //　０からaの－１までアスタリスクを出力する。
                    System.out.print(AST);
                }
                //　aの最後はアスタリスクを出力するとき、改行する。
                System.out.println(AST);
            }
        }
    }
}
