package day2;

public class Ifex1 {

	public static void main(String[] args) {
	/*정수가 홀수인지 짝수인지 판별하는 코드를 작성 */
		int num = 3;
		if(num == 0){
		    System.out.println( num +"는0 입니다");
		}else if((num % 2)==0) {
			System.out.println( num +"는 짝수입니다");
		}else{
			
			System.out.println( num +"는 홀수입니다.");
			}
	}
	
}
