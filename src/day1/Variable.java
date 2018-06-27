package day1;

public class Variable {
	public static void main(String[] args) {
	 //변수 규칙
		//int 1num;//변수명 숫자 올수업다
	 //int num%;//특수문자는 $ 와 _ 만 가능
	 //int int; // 키워드 사용 불가
	 //int num 1;// 공백 사용불가

	 int num;
	 //int num; // 동일한 변수 선연불가
	 int Num; // 대소문자 구별하여 다른 변수로 취급 
	//변수 관례 
	 int StudentScore; // 2단어 이상으로 변수명을 만들경우 두번쨰 단어의 첫글자를 대문자로한다
	 //첫글자를 대문자로 한다: 카멜표기법
     int a; // (x) 변수는 변수명을 보고 해당하는 역활을 알 수 있어야 된다
     num = 10;
	//10 : 10* 1+1 *0 =10
     //0x11: 16*1+1*1=17
     // 012 : 8*1+1*2=10
     System.out.println("num=10 :"+num);
	num= 0x11;
	System.out.println("num=0x11 :"+num);
	num = 012;
	System.out.println("num=012 :"+num);
	double num2 = 1.234;
	System.out.println("num=1.234 :"+num2);
	num2 = 1.234e3;
	System.out.println("num=1.234e3 :"+num2);
	char ch = 'A';
			System.out.println("ch = 'A':" + ch);
			ch = '한';
			System.out.println("ch = '한':" + ch);
			
		boolean isTrue = false;
		System.out.println("isTrue = false:" + isTrue);
		isTrue = true;
		System.out.println("isTrue = true:" + isTrue);
	}
	
}
