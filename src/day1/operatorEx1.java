package day1;

public class operatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1 = 10, num2 = 3;
	double res = 0;
	//��� ������ ����
	
	res = num1 + num2;
	System.out.println("num1 + num2 =" + res);
	res = (double)num1 - num2;//double �� ���� ����
	System.out.println("num1 - num2 =" + res);
	res = num1 * num2;
	System.out.println("num1 * num2 =" + res);
	//num1 �� �ӽ÷� �Ǽ��� �ٲ� : �ڷ�����ȯ, �ڵ� �ڷ�����ȯ
	res = (double)num1 / num2;
	System.out.println("num1 / num2 =" + res);
	res = num1 % num2;
	System.out.println("num1 % num2 =" + res);
	//¦��Ȧ�� ���� Ȯ�ο� �ַλ�� ������ �����������
	num1 = (int)res;//���� = �Ǽ��� �Ұ�, ����� ����ȯ���� �̿���
	
	//�� ������ : ����� �� �Ǵ� ������ ��ȯ
	//ũ�ų� ���� : >=(0), => (x)	
	    boolean ispositive = false;
		num1 = 20;
		ispositive = num1 >= 0;
		System.out.println("num :" + num1 + ",���:"+ ispositive);
	    boolean isSame = false;
	    isSame = num1 == 10;
	    System.out.println("num1 :" + num1 + ",10�� ����:" + isSame);
	    boolean isDiffent = false;
	    isDiffent = num1 !=10;
	    System.out.println("num1 : " + num1 + ",10�� �ٸ� :" + isDiffent);
	//�� ������ : ����� true �ƴϸ� false
	// �� ������ �������� ��, �쿡 ���ǽ��� �巯������
	// ���ǽ� : ����  �������� ������ ��
	//(�񱳿����ڸ� �̿��� ��) �� ������ (�񱳿����ڸ� �̿��ѽ� )
	//�������� ��ȣ : &&(�׸���),||(�Ǵ�),!(�ƴϴ�) 
	    num1 = 30;
	    // 0 <= num1 <= 100
	    // num1�� 0���� ũ�ų� ����, num1�� 100���� �۰ų� ����.
	    //false
	    // 0 <= num1 num1 <=100
	    //&& and
	    //|| or
	    //! ���̸� ��������, �����̸� ������
	    boolean isSore = 0 <= num1 && num1 <= 100;
	 
		System.out.println(num1 + "�� ������ �����ΰ� : "+ isSore);
		boolean isNot = !false;
		System.out.println("!false : " + isNot);
	// ��Ʈ �� ������: �� ������ ��Ʈ�� ������ �� 
	// ����Ʈ���� �� ������ �Ѵ�..
	// ����� true, false �� �ƴ� �������� ���´�.
	// �Ӻ���� ���α׷����� �ַ� ���
		//&(�׸���), |(�Ǵ�), ~(�ƴϴ�), ^(��Ʈ)
		num1 = 7;
		num2 = 10;
		int num3 = 7 & 10;
		//  7:00000000 00000000 00000000 00000111
		// 10:00000000 00000000 00000000 00001010
		//  2: 00000000 00000000 00000000 00000010
		System.out.println("7&10: " + num3);
	//  7:00000000 00000000 00000000 00000111
	// 10:00000000 00000000 00000000 00001010
	// 15:00000000 00000000 00000000 00001111
		num3 = 7|10;
		System.out.println("7&10: " + num3);
		//  7:00000000 00000000 00000000 00000111
		// 10:00000000 00000000 00000000 00001010
		// 13:00000000 00000000 00000000 00001101
		// ^ ������ 0 �ٸ��� 1
		num3 = 7^10;
		System.out.println("7&10: " + num3);
	//  7:00000000 00000000 00000000 00000111
		// 0 �� 1 1�� 0 ��ģ��
		//~7(-8):11111111 11111111 11111111 11111000
	    //                        -1           
		//       11111111 11111111 11111111 11110111
	              
		num3 = ~7;
		System.out.println("~7: " + num3);
		System.out.println(7+4);
		// ����� ���
		System.out.println(""+7+4);
	    // ���ڿ�7 �� 4�� ������ 74
		
		//��Ʈ ����Ʈ ������:��Ʈ�� �̵���Ŵ 
		/*>>, <<  */
		//  15:00000000 00000000 00000000 00001111
		//  30  :00000000 00000000 00000000 00011110
		//  60:00000000 00000000 00000000 00111100
		num1 = 15;
		num3 = num1 <<2;
		System.out.println("15<<2: "+ num3);
		num3 = num1 <<1;
		System.out.println("15<<1: "+ num3);
		//  15:00000000 00000000 00000000 00001111
		//  30:00000000 00000000 00000000 00000011
		//  60:00000000 00000000 00000000 00111100
			num1 = 15;
			num3 = num1 >>2;
			System.out.println("15>>2: "+ num3);
		//���� ������ : ++, --
		//++ : ���� ������ 1 ������
		//-- : ���� ������ 1 �� ����
		//++ ������(������), ������++(������)
			
		num1 = 10;
		num1++;
		System.out.println("�����������: " + num1);
		
		num1 = 10;
		++num1;
		System.out.println("�����������: " + num1);
	   
		
		num1 = 10;
		
		System.out.println("�����������: " + num1++);
		System.out.println("�����������: " + num1);
		num1 = 10;
		
		
		
		System.out.println("�����������: " + ++num1);
	//���� ���� ������(���׿�����)
	//(���ǽ�)?(��1):(��2);
    //���ǽ��� ���̸� ��1��, �����̸� ��2
		
		System.out.println((10%2==0)?"¦��":"Ȧ��");
	/*���տ�����: �����
	 num1 = num1 + 2;
	 num1 +=2;
	 num1 = num1 << 1;
	 num1 <<=1;
*/	
	}

}
