package day2;

public class ForEx5 {
/*������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���
 * �Ҽ��� ����� 1�� �ڱ��ڽ��� ��
 * 2,3,5,7,11
 ���2
 1.i �� num-1 ���� 1���� �ϳ��� �����ϸ鼭 �ݺ�
 2.num�� i�� �������� �� �������� 0�̸� �ݺ��� ����
 4. i�� 1�̸� �Ҽ�, �ƴϸ� �ռ���
 
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
			System.out.println(num +"�Ҽ�");
	}
		else{System.out.println(num+"�ռ���");
		}
	//i �� 1�̸� num�� ������ 1�̶�� �ǹ��̰�,
		//�̴� ����� 2����� �ǹ��̹Ƿ� �Ҽ��̴�.
		if(i == 1){
		System.out.println(num +"�Ҽ�");
	}
	else{
		System.out.println(num+"�ռ���");
	}
		
	}

}

