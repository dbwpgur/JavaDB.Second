package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
	/*	switch(변수){
		case 값1:
			실행문1;
	    break;  ㅡㅡ> (있으면 변수값이 값1일 때 실행문 1만 실행하고, 없으면 변수값이
	    값1일때 1과 실행문 2가 같이 실행됨)
		case 값2:
			실행문2;
		break;
    	default: else 와같은역활
    }
    */
		int num = 2;
		
		switch(num){
		case 0:
			System.out.println("0 입니다");
			break;
		case 1:
			System.out.println("1 입니다");
			break;
		default:
			System.out.println(num     
					+" =0과 1이 아닙니다");
		}
		
		
		
	}

}


