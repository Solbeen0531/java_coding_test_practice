//Java - Programmers - 코딩테스트 문제 - 기초 문제
//https://school.programmers.co.kr/learn/courses/30/lessons/181950

/* 기본 제공 코드
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
    }
}
*/

import java.util.Scanner;

public class 문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i=1; i<n+1; i++) {
        	System.out.print(str);
        }
        
        sc.close();
    }
}

//소스 코드 해설
//https://free-weave.tistory.com/23
