package day3;

public class ArrayEx3 {

	public static void main(String[] args) {
	//정수의 약수를 배열에 저장하는 코드를 작성하시오.
	//배열은 10개까지로 하고, 약수의 10개이상인 수들은 10개까지만구한다	
	int div[] = new int[10];
	int i =0;
	int num =12;
	int cnt=0;
	i=1;
	while(i<=num){
		if(num%i==0){
		
			div[cnt]=i;
		    cnt++;
		 if(cnt ==10)
			 break;
		}
	 i++;
	}
    i=0;
    while(i<cnt){
    	System.out.println(div[i]+"");
    	i++;
    }
}
}