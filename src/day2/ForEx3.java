package day2;

public class ForEx3 {

	public static void main(String[] args) {
		/* �μ��� �ִ� ����� ���ϴ� �ڵ�
		 * �ִ� ����� : �μ��� ����� �� ���� ū��
		 * ����� : �μ��� ����� ������ ���
		 * ��� : ������ �������� ���� 4�� ����� 1,2,3
		 * 8�� 12 �� �ִ�����
		 * 8:1,2,4,8
		 * 12:1,2,3,4,6,12
		 */
	    /* 234�� ����� ���ϴ� �ڵ带 �ۼ��ϼ���.
	     * ������ 1���� �ڱ� �ڽű��� ����� ��������  0�̵Ǹ� �׼��� ������ ����̴�*/
	/*int num1 =12;
	int num2=8;
	int gcd =1;
	System.out.println("�ִ�����");
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
		System.out.println("�ּҰ����");
		for(int i=2; i>=num1; i--){
			if(num1*i==num2*i){
				acz = i;
			}
		}
		System.out.println(acz);
	}
}
	
	


