/*
 * 게시판 관리 애플리케이션 
 * 20220704
 */
package com.bitcamp.board;

public class App {

    public static void main(String[] args) {
        System.out.println("[게시판 애플리케이션]");
        System.out.println();
        System.out.println("환영합니다!");
        System.out.println();

        System.out.println("메뉴:");
        System.out.println("  1: 게시글 목록");
        System.out.println("  2: 게시글 상세보기");
        System.out.println();
        System.out.print("메뉴를 선택하세요[1..2] ");

        java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
        int menuNum = keyboardInput.nextInt(); // expression. 결과를 return하는 명령문

        if (menuNum == 1) {
            System.out.println("[게시글 목록]");
            System.out.println("번호 제목 조회수 작성자 등록일");
            System.out.print(1);
            System.out.print("\t");
            System.out.print("제목입니다1");
            System.out.print('\t');
            System.out.print(20 + "\t");
            System.out.print("황의찬\t");
            System.out.print("2022-07-08\n");

            System.out.print(2 + "\t" + "제목입니다2\t" + 11 + "\t" + "홍길동\t" + "2022-07-08\n");

            System.out.println(3 + "\t" + "제목입니다3\t" + 11 + "\t" + "임꺽정\t" + "2022-07-08");

            System.out.printf("%d\t%s\t%d\t%s\t%s\n", 4, "제목입니다4", 45, "유관순", "2022-07-08");

        } else if (menuNum == 2) {
            System.out.println("[게시판 상세보기]");

            System.out.printf("번호: %d\n", 1);
            System.out.printf("제목: %s\n", "제목입니다1.");
            System.out.printf("내용: %s\n", "내용입니다.");
            System.out.printf("조회수: %d\n", 100);
            System.out.printf("작성자: %s\n", "홍길동");
            System.out.printf("등록일: %s\n", "2022-07-08");
        } else {
            System.out.println("메뉴 번호가 옳지 않습니다!");
        }

        // keyboardInput.close();
    }
}
