/*
 * 키보드 입력을 받는 도구를 구비한 클래스. 
 * 20220704
 */
package com.bitcamp.board;

import java.util.Date;

public class Prompt {

    static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    
    // 메서드를 통해 특정 코드의 복잡함을 감출 수 있다. ==> Encapsulation

    //== int 입력 ==//
    static int inputInt() {
        String str = keyboardInput.nextLine(); // expression. 결과를 return하는 명령문
        return Integer.parseInt(str); // "123" ==> 123 "ok" ==> 실행 오류

    }
    //== method overLoading ==//
    static int inputInt(String title) {
        System.out.print(title);
        String str = keyboardInput.nextLine(); 
        return Integer.parseInt(str); 

    }

    //== String 입력 ==//
    static String inputString() {
        return keyboardInput.nextLine();
    }

    //== method overLoading ==//
    static String inputString(String title) {
        System.out.print(title);
        return keyboardInput.nextLine();
    }

    static void close() {
        keyboardInput.close();
    }

}
