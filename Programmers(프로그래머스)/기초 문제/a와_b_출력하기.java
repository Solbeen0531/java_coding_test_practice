//Java - Programmers - 코딩테스트 문제 - 기초 문제
//https://school.programmers.co.kr/learn/courses/30/lessons/181951

/* 기본 제공 코드
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
*/

import java.util.Scanner;

public class a와_b_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        sc.close();        
    }
}
