package day3;

public class ArrayEx3 {

	public static void main(String[] args) {
	//������ ����� �迭�� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
	//�迭�� 10�������� �ϰ�, ����� 10���̻��� ������ 10�����������Ѵ�	
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