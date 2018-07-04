package day2;

public class ForEx3 {

	public static void main(String[] args) {
		/* 두수의 최대 공약수 구하는 코드
		 * 최대 공약수 : 두수의 공약수 중 가증 큰수
		 * 공약수 : 두수의 약수중 공통인 약수
		 * 약수 : 나누어 떨어지는 수로 4의 약수는 1,2,3
		 * 8과 12 의 최대공약수
		 * 8:1,2,4,8
		 * 12:1,2,3,4,6,12
		 */
	    /* 234의 약수를 구하는 코드를 작성하세요.
	     * 정수를 1부터 자기 자신까지 나누어서 나머지가  0이되면 그수는 정수의 약수이다*/
	/*int num1 =12;
	int num2=8;
	int gcd =1;
	System.out.println("최대공약수");
	for(int i=1; i<=8; i++){
		if(num1%i==0&&num2%i==0){
			gcd = i;
		}
	}
	System.out.println(gcd);
*/
		int num1 =2;
		int num2 =4;
		int acz =1;
		System.out.println("최소공배수");
		for(int i=2; i>=num1; i--){
			if(num1*i==num2*i){
				acz = i;
			}
		}
		System.out.println(acz);
	}
}
	
	


