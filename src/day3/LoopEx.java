package day3;

public class LoopEx {

	public static void main(String[] args) {
		/*1.가장 기본적인 무한루프 만드는법
		 * 
		 */
		/*for( ; ;){
			System.out.println("Hello world");
		}*/
		/*2.잘못된 초기화로 인한 반무한루프
		 * 
		 */
	/*	int i =1;
		for(i=-100000000;i<=10;i++){
				System.out.println("Hello world");
		}*/
		/*3.잘못된 조건식으로 인한 반무한 루프 
		 */
	/*	int i=1;
		for(i=1; i>=1; i++){
			System.out.println("Hello world");
		*/
		/*4.잘못된 증감연산
		int i =1;
		for(i=1;i<=10;i--){
			System.out.println("Hello world");
		}
	*/
	/*반복문 실행이 한번도 안되는 경우 
	 	1.변수 초기화를 잘못한 경우*/
//		int i = 1;
//		for(i=1 ; i<=10; i++){
//			System.out.println("Hello world");
//		}
//	 2.변수 초기화를 하지 않은 경우	
//	 int i=0;
//	 for(i=0;i<=10;i++){
//		 	System.out.println("Hello world");
//	 }
//		 	for(;i<=10;i++){
//		 	System.out.println("Hello world");
//	 }
//	3. 조건식을 잘못한경우
     for(int i=1; i>=10; i++){
    	 System.out.println("Hello world");
     }
	}
	

}
