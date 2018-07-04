package day2;

public class ForEx5 {
/*정수가 소수인지 아닌지 판별하는 코드를 작성하세요
 * 소수는 약수가 1과 자기자신인 수
 * 2,3,5,7,11
 방법2
 1.i 는 num-1 부터 1까지 하나씩 감소하면서 반복
 2.num를 i로 나누었을 때 나머지가 0이면 반복문 종료
 4. i가 1이면 소수, 아니면 합성수
 
 */
	
	public static void main(String[] args) {
		int num=321;
		int cnt=0;	
		int i=0;
		for(i=1;num>=i;i++){
	 if(num%i==0){
			cnt++;
		}
	
	}
		if(cnt ==2){
			System.out.println(num +"소수");
	}
		else{System.out.println(num+"합성수");
		}
	//i 가 1이면 num를 제외한 1이라는 의미이고,
		//이는 약수가 2개라는 의미이므로 소수이다.
		if(i == 1){
		System.out.println(num +"소수");
	}
	else{
		System.out.println(num+"합성수");
	}
		
	}

}

