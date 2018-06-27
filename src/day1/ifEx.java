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
		// 만약 num 이 0 이면 0출력	
			System.out.println( num +"는0 입니다");
		}else if((num % 2)==0) {
	    //  만약 num가 0이 아니고,
		//	num를 2로나누었을때 결과가 0과 같다면, 콘솔에 짝수 입니다 출력
			System.out.println( num +"는 짝수입니다");
		}else{
			//num 이 0이아니고 2로나누었을때 0과 같지않다면 콘솔에 홀수를 출력하세요.
			System.out.println( num +"는 홀수입니다.");
			}
	}
	
}


