package day1;

public class ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*if(조건식){
  실행문; }
 조건식이 참일때 실행됨
  else{
  	 실행문2; 조건식이 거짓일 때 실행됨
  if 와 else if 순서가중요!!
 */
		int num = 0;
		if((num == 0)){
			System.out.println( num +"는0 입니다");
		}else if(num % 2==0) {
			System.out.println( num +"는 짝수입니다");
		}else{
			System.out.println( num +"는 홀수입니다.");
			}
	}
	
}


