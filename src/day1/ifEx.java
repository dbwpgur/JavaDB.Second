package day1;

public class ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*if(���ǽ�){
  ���๮; }
 ���ǽ��� ���϶� �����
  else{
  	 ���๮2; ���ǽ��� ������ �� �����
  if �� else if �������߿�!!
 */
		int num = 0;
		if((num == 0)){
		// ���� num �� 0 �̸� 0���	
			System.out.println( num +"��0 �Դϴ�");
		}else if((num % 2)==0) {
	    //  ���� num�� 0�� �ƴϰ�,
		//	num�� 2�γ��������� ����� 0�� ���ٸ�, �ֿܼ� ¦�� �Դϴ� ���
			System.out.println( num +"�� ¦���Դϴ�");
		}else{
			//num �� 0�̾ƴϰ� 2�γ��������� 0�� �����ʴٸ� �ֿܼ� Ȧ���� ����ϼ���.
			System.out.println( num +"�� Ȧ���Դϴ�.");
			}
	}
	
}


