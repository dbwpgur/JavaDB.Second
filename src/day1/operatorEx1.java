package day1;

public class operatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1 = 10, num2 = 3;
	double res = 0;
	//산술 연산자 예제
	
	res = num1 + num2;
	System.out.println("num1 + num2 =" + res);
	res = (double)num1 - num2;//double 를 생략 가능
	System.out.println("num1 - num2 =" + res);
	res = num1 * num2;
	System.out.println("num1 * num2 =" + res);
	//num1 을 임시로 실수로 바꿈 : 자료형변환, 자동 자료형변환
	res = (double)num1 / num2;
	System.out.println("num1 / num2 =" + res);
	res = num1 % num2;
	System.out.println("num1 % num2 =" + res);
	//짝수홀수 구분 확인에 주로사용 나누고 나머지값출력
	num1 = (int)res;//정수 = 실수로 불가, 명시적 형변환율을 이용함
	
	//비교 연산자 : 결과가 참 또는 거짓을 반환
	//크거나 같다 : >=(0), => (x)	
	    boolean ispositive = false;
		num1 = 20;
		ispositive = num1 >= 0;
		System.out.println("num :" + num1 + ",양수:"+ ispositive);
	    boolean isSame = false;
	    isSame = num1 == 10;
	    System.out.println("num1 :" + num1 + ",10과 같음:" + isSame);
	    boolean isDiffent = false;
	    isDiffent = num1 !=10;
	    System.out.println("num1 : " + num1 + ",10과 다름 :" + isDiffent);
	//논리 연산자 : 결과가 true 아니면 false
	// 논리 연산자 기준으로 좌, 우에 조건식이 드러가야함
	// 조건식 : 참과  거짓으로 나뉘는 식
	//(비교연산자를 이용한 식) 논리 연산자 (비교연산자를 이용한식 )
	//논리연산자 기호 : &&(그리고),||(또는),!(아니다) 
	    num1 = 30;
	    // 0 <= num1 <= 100
	    // num1이 0보다 크거나 같고, num1이 100보다 작거나 같다.
	    //false
	    // 0 <= num1 num1 <=100
	    //&& and
	    //|| or
	    //! 참이면 거짓으로, 거짓이면 참으로
	    boolean isSore = 0 <= num1 && num1 <= 100;
	 
		System.out.println(num1 + "은 유요한 성적인가 : "+ isSore);
		boolean isNot = !false;
		System.out.println("!false : " + isNot);
	// 비트 논리 연산자: 두 변수를 비트로 나열한 후 
	// 각비트별로 논리 연산을 한다..
	// 결과는 true, false 가 아님 변수값이 나온다.
	// 임베디드 프로그램에서 주로 사용
		//&(그리고), |(또는), ~(아니다), ^(베트)
		num1 = 7;
		num2 = 10;
		int num3 = 7 & 10;
		//  7:00000000 00000000 00000000 00000111
		// 10:00000000 00000000 00000000 00001010
		//  2: 00000000 00000000 00000000 00000010
		System.out.println("7&10: " + num3);
	//  7:00000000 00000000 00000000 00000111
	// 10:00000000 00000000 00000000 00001010
	// 15:00000000 00000000 00000000 00001111
		num3 = 7|10;
		System.out.println("7&10: " + num3);
		//  7:00000000 00000000 00000000 00000111
		// 10:00000000 00000000 00000000 00001010
		// 13:00000000 00000000 00000000 00001101
		// ^ 같으면 0 다르면 1
		num3 = 7^10;
		System.out.println("7&10: " + num3);
	//  7:00000000 00000000 00000000 00000111
		// 0 은 1 1은 0 고친다
		//~7(-8):11111111 11111111 11111111 11111000
	    //                        -1           
		//       11111111 11111111 11111111 11110111
	              
		num3 = ~7;
		System.out.println("~7: " + num3);
		System.out.println(7+4);
		// 계산결과 출력
		System.out.println(""+7+4);
	    // 문자열7 과 4를 보여줌 74
		
		//비트 쉬프트 연산자:비트를 이동시킴 
		/*>>, <<  */
		//  15:00000000 00000000 00000000 00001111
		//  30  :00000000 00000000 00000000 00011110
		//  60:00000000 00000000 00000000 00111100
		num1 = 15;
		num3 = num1 <<2;
		System.out.println("15<<2: "+ num3);
		num3 = num1 <<1;
		System.out.println("15<<1: "+ num3);
		//  15:00000000 00000000 00000000 00001111
		//  30:00000000 00000000 00000000 00000011
		//  60:00000000 00000000 00000000 00111100
			num1 = 15;
			num3 = num1 >>2;
			System.out.println("15>>2: "+ num3);
		//증감 연산자 : ++, --
		//++ : 원래 값에서 1 이증가
		//-- : 원래 값에서 1 이 감소
		//++ 변수명(전위형), 변수명++(후위형)
			
		num1 = 10;
		num1++;
		System.out.println("계산후후위형: " + num1);
		
		num1 = 10;
		++num1;
		System.out.println("계산중전위형: " + num1);
	   
		
		num1 = 10;
		
		System.out.println("계산중후위형: " + num1++);
		System.out.println("계산후후위형: " + num1);
		num1 = 10;
		
		
		
		System.out.println("계산중전위형: " + ++num1);
	//조건 선택 연산자(삼항연산자)
	//(조건식)?(값1):(값2);
    //조건식이 참이면 값1을, 거짓이면 값2
		
		System.out.println((10%2==0)?"짝수":"홀수");
	/*결합연산자: 축약형
	 num1 = num1 + 2;
	 num1 +=2;
	 num1 = num1 << 1;
	 num1 <<=1;
*/	
	}

}
