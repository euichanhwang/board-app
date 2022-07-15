/*
 * 게시글 메뉴 처리 클래스 
 * 20220704
 */
package com.bitcamp.board;

import java.util.Date;

public class BoardHandler {

    static int boardCount = 0; // 저장된 게시글의 개수를 담는 변수

    static final int SIZE = 3; // static 메소드끼리 변수 공유하기 위해 static 키워드 사용 

    static int[] num = new int[SIZE];
    static String[] title = new String[SIZE];
    static String[] content = new String[SIZE];        
    static String[] writer = new String[SIZE];
    static String[] password = new String[SIZE];
    static int[] viewCount = new int[SIZE];
    static long[] createdDate = new long[SIZE];

    static void processList() {

         // 날짜 정보에서 값을 추출하여 특정 포맷의 문자열로 만들어줄 도구를 준비 
        java.text.SimpleDateFormat formatter = 
        new java.text.SimpleDateFormat("yyyy-MM-dd");
 
        System.out.println("[게시글 목록]");
        System.out.println("번호 제목 조회수 작성자 등록일");
  
    
        for(int i=0; i < boardCount;i++) {
            // date = new Date(createdDate[i]);

            // 날짜 정보 -> 'yyyy-MM-dd' 형식의 문자열 
            String dateStr = formatter.format(new Date(createdDate[i]));
            System.out.printf("%d\t%s\t%d\t%s\t%s\n", num[i], title[i], viewCount[i]
            , writer[i], dateStr);
        }
    }
    static void processDetail() {
        System.out.println("[게시글 상세보기]");

        int boardNum = Prompt.inputInt("조회할 게시글 번호는 몇 번입니까? ");
        // keyboardInput.nextLine();

        // 해당 번호의 게시글이 몇 번 배열의 원소에 들어 있는지 알아내기 
        int boardIndex = -1;
        for (int i=0; i < boardCount; i++) {
            if (num[i] == boardNum) {
                boardIndex = i;
                break;
            }
        }
        // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면
        if (boardIndex == -1) {
            System.out.println();
            System.out.println("해당 번호의 게시글이 없습니다.");
            return;
        }

        System.out.printf("번호: %d\n", num[boardIndex]);
        System.out.printf("제목: %s\n", title[boardIndex]);
        System.out.printf("내용: %s\n", content[boardIndex]);
        System.out.printf("조회수: %d\n", viewCount[boardIndex]);
        System.out.printf("작성자: %s\n", writer[boardIndex]);
        // Date 도구함의 도구를 쓸 수 있도록 데이터를 준비.
        // new Date(밀리초) -> 지정한 밀리초를 가지고 날짜 관련 도구를 사용할 수 있도록 설정한다.
        // Date date -> created 밀리초를 가지고 설정한 날짜 정보 
        java.util.Date date = new java.util.Date(createdDate[boardIndex]);

        // Date 도구함을 통해 설정한 날짜 정보를 가지고 printf()를 실행한다.
        // %Y : date에 설정된 날짜 정보에서 년도만 추출한다.
        System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM\n", date);     

    }
    static void processInput() {
        System.out.println("[게시글 등록]");

        // 배열의 크기를 초과하지 않았는지 검사
        if (boardCount == SIZE) {   
            System.out.println("게시글을 더 이상 저장할 수 없습니다.");
            return;
        }

        title[boardCount] = Prompt.inputString("제목:  ");

        content[boardCount] = Prompt.inputString("내용:  ");

        writer[boardCount] = Prompt.inputString("작성자:  ");

        password[boardCount] = Prompt.inputString("암호:  ");

        if(boardCount==0){
            num[boardCount] = 1;
        } else {
            num[boardCount] = num[boardCount-1]+1;
        }
        // no[boardCount] = boardCount == 0 ? 1: no[boardCount-1]+1;
    
        viewCount[boardCount] = 0;
        createdDate[boardCount] = System.currentTimeMillis();
        boardCount++;

    }
   

}
