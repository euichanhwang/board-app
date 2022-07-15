/*
 * 게시판 관리 애플리케이션 
 * 20220704
 */
package com.bitcamp.board;

import java.util.Date;

public class App {


    public static void main(String[] args) {
        
        welcome();
       
        // loop:
        while (true) {
            displayMenu();
            int menuNum = Prompt.inputInt("메뉴를 선택하세요[1..3](0: 종료) ");
            displayLine();
            /* 
            switch (menuNum) {
                case 0: break loop;
                case 1: processBoardList(); break;
                case 2: processBoardDetail(); break;
                case 3: processBoardInput(); break;
                default: System.out.println("메뉴 번호가 옳지 않습니다!");      
            }
            System.out.println();
            */
            if (menuNum == 0) {
                break;
            } 
            else if (menuNum == 1) {
                BoardHandler.processList();
            } else if (menuNum == 2) {
                BoardHandler.processDetail();
            } else if (menuNum == 3) {
                BoardHandler.processInput();
            }
            else {
                System.out.println("메뉴 번호가 옳지 않습니다!");
            }
            displayBlankLine();
        } // while 
        System.out.println("안녕히 가세요!");
        Prompt.close();
    } // main

    // 메소드 선언 
    static void welcome() {
        System.out.println("[게시판 애플리케이션]");
        System.out.println();
        System.out.println("환영합니다!");
        System.out.println();
    }
   
    static void displayMenu() {
        System.out.println("메뉴:");
        System.out.println("  1: 게시글 목록");
        System.out.println("  2: 게시글 상세보기"); 
        System.out.println("  3: 게시글 등록"); 
        System.out.println();
      

    }

    static void displayLine() {
        System.out.println("===========================================");
    }


    static void displayBlankLine() {
        System.out.println();
    }

}
