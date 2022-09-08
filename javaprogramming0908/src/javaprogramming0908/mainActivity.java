package javaprogramming0908;

	import java.util.Scanner; // import for encode Input data(Byte data) 

	public class mainActivity { // 연습문제 8번
	   
	   final static int Esspresso = 2000; // 에스프레소 2000원
	   final static int Americano = 2500; // 아메리카노 2500원
	   final static int Cafuchino = 3000; // 카푸치노 3000원
	   final static int CafeLatte = 3500; // 카페라떼 3500원
	   
	   public static void accelerate(String c, int h, int ch) { // if or switch로 커피 값 계산을 위한 함수
	      if(ch == 1) { // if 문을 선택한 경우
	         if(c.equals("에스프레소")) { // 입력받은 커피가 에스프레소 일 경우
	            System.out.println(Esspresso*h + "원입니다.");
	         }
	         else if(c.equals("아메리카노")) {// 입력받은 커피가 아메리카노 일 경우
	            System.out.println(Americano*h + "원입니다.");
	         }
	         else if(c.equals("카푸치노")) {// 입력받은 커피가 카푸치노 일 경우
	            System.out.println(Cafuchino*h + "원입니다.");
	         }
	         else if(c.equals("카페라떼")) {// 입력받은 커피가 카페라떼 일 경우
	            System.out.println(CafeLatte*h + "원입니다.");
	         }
	         else { // 잘못된 입력을 받은 경우
	            System.out.println("저희 매점에 없는 커피입니다.");
	         }
	      }
	      else if(ch == 2) { // switch문을 선택한 경우
	         int casenum = 0;
	         
	         if(c.equals("에스프레소")) { // 입력받은 커피가 에스프레소 일 경우
	            casenum = 1;
	         }
	         else if(c.equals("아메리카노")) { // 입력받은 커피가 아메리카노 일 경우
	            casenum = 2;
	         }
	         else if(c.equals("카푸치노")) { // 입력받은 커피가 카푸치노 일 경우
	            casenum = 3;
	         }
	         else if(c.equals("카페라떼")) {// 입력받은 커피가 카페라떼 일 경우
	            casenum = 4;
	         }
	         
	         switch(casenum) {
	         
	         case 1: // 에스프레소
	            System.out.println(Esspresso*h + "원입니다.");
	            break;
	         case 2: // 아메리카노
	            System.out.println(Americano*h + "원입니다.");
	            break;
	         case 3: // 카푸치노
	            System.out.println(Cafuchino*h + "원입니다.");
	            break;
	         case 4: // 카페라떼
	            System.out.println(CafeLatte*h + "원입니다.");
	            break;
	         default:
	            System.out.println("잘못된 입력입니다.");
	            break;
	         }
	      }
	   }
	   
	       public static void main(String[] args) {
	          
	          Scanner scanner = new Scanner(System.in); // 사용자로부터 키보드 입력을 받기 위한 스캐너 선언
	          
	          System.out.println("if문으로 문제 풀이 : 1\nswitch문으로 문제 풀이 : 2");
	          
	          int choose = scanner.nextInt(); // if 문 혹은 switch 문 중 어떤 방법으로 실행할 지 입력 받기
	          
	          if(choose == 1 || choose == 2) {
	             
	             System.out.println("\n커피 주문하세요");
	              String coffee = scanner.next(); // 커피 종류
	              int howmany = scanner.nextInt(); // 갯수
	              accelerate(coffee, howmany, choose); // 계산 함수 호출
	          }
	          
	          else { // 엉뚱한 입력을 받은 경우
	             System.out.println("잘못된 입력입니다.");
	             System.exit(0);
	          }
	      }

}
