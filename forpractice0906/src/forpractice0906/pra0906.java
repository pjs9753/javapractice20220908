package forpractice0906;

import java.util.Scanner; // import for encode Input data(Byte data) 

public class pra0906 { // 연습문제 3번
       public static void main(String[] args) {
          
          Scanner scanner = new Scanner(System.in);
          
          int numx, numy; // x, y 변수 선언
          System.out.println("x 값을 입력하세요 >> ");
          numx = scanner.nextInt(); // x 값 입력받기
          
          numy = numx*numx - 3*numx + 7; // y 값 계산
          
          System.out.println("x = " + numx + "\ny = " + numy); // x, y 값 출력하기
      }
       
       
}