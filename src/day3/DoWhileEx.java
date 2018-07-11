package day3;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
//   do{실행문;
//      증감연산;
//      }while(조건식);
//조건식이 참이든 거짓이든 상관없이 무조건 한번은 실행함
		
		char mode='q';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("메뉴");
			System.out.println("1.학생정보추가");
			System.out.println("2.학생정보출력");
			System.out.println("3.프로그램 종료");
			System.out.println("메뉴를 선택하세요");
		    mode = scan.next().charAt(0);
		}while(mode !='q');
	}

}
