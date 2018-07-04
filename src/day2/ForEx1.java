package day2;

public class ForEx1 {

	public static void main(String[] args) {
	/* 반복문은 규칙성을 가지고 동일한 동작을 수행하도록 하는문법
	 * for , while , do while 3가지
	 * for 또는 while 문을 주로 사용하고 , do while 문 잘사용하지않음
	 * 반복문에서 중요한건 규칙성을 찾는게 중요하다
	
	for(변수초기화; 조건식; 증감연산){
		실행문;
	}
	 변수초기화는 반복문의 반복횟수를 위해 사용하는 변수의 초기갑을 설정
	 조건식 : 반복횟수를 결정하는 변수가 언제까지 반복할건지를 저해주는 조건식
	 증감연산 : 반복회수를 결정하는 변수를 증가하거나 감소를 시킴
	 for문 동작순서 
	 변수초기화 > 조건식> 실행문>증감연산 >조건식>실행문>증감연산 > 조건식이 거짓일때까지
		 */
	int i =0;
	for(i=1; i<=5; i++){
		System.out.println("Hello World!");
	}
	}

}
