package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/*배열은 자료형이 같은 변수를 하나로 묵는것
		 동일한 목적의 변수이어야 한다.
		 */
    
       int num[]= new int [5];
	/*1.배열을 쓰면 반복문을 이용하기 편하다
	 *2.배열의 값을 가져오기 위해서는 배열의 인덱스로
	 * 접근해야하는데 인덱스의 시작 번지는 0번지이다 
	 *3.배열의 마지막 인덱스(번지)는 배열의 크기-1이다.*/
      
    //   num[0]=1;//0번지에 1을 저장
	
      //기본 배열예제
       for(int i=0; i<num.length; i++){
    	  num[i] =i+1;
      }
	  for(int i=0;i<num.length; i++){
		  System.out.println("num["+i+ "] :"  +num[i]);
	  }
	 //num1:배열 num2:배열 num3: 배열 num4: 일반변수
	 int []num1,num3; //int[]이 공통으로 되어 num1,num3 가 배열이됨
	 //int가 공통으로 되어 num2는 배열, num4는 일반 변수가됨
	 int num2[],num4;
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	if(size >=0)
		num1 = new int[size];
	scan.close();
	/*배열 초기화*/int num5[]={1,2,3,4,5,};
	   for(int i=0; i<num5.length; i++){
	    	  num[i] =i+1;
	      }
		  for(int i=0;i<num.length; i++){
			  System.out.println("num["+i+ "] :"  +num5[i]);
	int num6[];
		 //num6={1,2,3,4,5,}; 초기화는 배열을 선언할때만 가능
		  }

}
}
