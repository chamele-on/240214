package ohgiraffers.section01.array;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        /* 필기.
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메모리 공간으로 관리할 수 없다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        *  */


        /* 목차. 배열의 선언 및 할당 */
        int[] arr = new int[5];

        System.out.println("arr = " + arr);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 필기.
        *  배열의 사용 방법
        *  1. 배열의 선언
        *  2. 배열의 할당
        *  3. 배열의 인덱스 공간에 값 대입
        * */

        /* 목차. 1. 배열의 선언 */

        int[] iarr4 = {10, 20, 30, 40, 50};
        System.out.println("iarr4 의 길이 :" + iarr4.length);

        for(int i = 0; i < iarr4.length; i++) {
            System.out.println("iarr4[" + i +"]" + " = " + iarr4[i]);
        }

        // 문자열 배열을 만들어 보자.
        String[] sarr = {"apple", "banana", "grape", "orange"};

        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "]" + " = " + sarr[i]);

        }

        int[] iarr = new int[5];
        char[] carr = new char[10];

        // 스캐너를 통해 입력 받은 정수로 배열 길이를 지정하여 배열 할당 연습
        Scanner sc = new Scanner(System.in);



    }
}
