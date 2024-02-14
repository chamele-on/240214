package ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용해보자(2) */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "번 째 학생의 자바 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();

        }

        avg = sum / scores.length;

        double sum = 0.0;
        double avg = 0.0;


    }
}
