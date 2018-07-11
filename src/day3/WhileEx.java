package day3;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
//		while(조건식){
//			실행문;
//			증감연산;
//		}
//		int i=1;
//		while(i<=5){
//			System.out.println("Hello world!");
//			i++;
//		}
 //   표준입력 받는방법
//		Scanner scan = new Scanner(System.in);    
//	int num =scan.nextInt();
//	System.out.println("num="+num);
//	double num2 = scan.nextDouble();
//	System.out.println("num2="+num2);
//	char ch = scan.next().charAt(0);
//	System.out.println("ch=1"+ch);
//	scan.close();
	
	Scanner scan = new Scanner(System.in);
    char mode = 'a';
    while(!(mode =='q'||mode =='Q')){
    	System.out.println("플로그램을 종료하려면 "+"q또는 Q를 눌러주세요");
    	mode = scan.next().charAt(0);
    }
	
	System.out.println("프로그램을 종료합니다");
	scan.close();
	
	
	
	}

}
