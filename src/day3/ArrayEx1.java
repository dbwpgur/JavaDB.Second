package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/*�迭�� �ڷ����� ���� ������ �ϳ��� ���°�
		 ������ ������ �����̾�� �Ѵ�.
		 */
    
       int num[]= new int [5];
	/*1.�迭�� ���� �ݺ����� �̿��ϱ� ���ϴ�
	 *2.�迭�� ���� �������� ���ؼ��� �迭�� �ε�����
	 * �����ؾ��ϴµ� �ε����� ���� ������ 0�����̴� 
	 *3.�迭�� ������ �ε���(����)�� �迭�� ũ��-1�̴�.*/
      
    //   num[0]=1;//0������ 1�� ����
	
      //�⺻ �迭����
       for(int i=0; i<num.length; i++){
    	  num[i] =i+1;
      }
	  for(int i=0;i<num.length; i++){
		  System.out.println("num["+i+ "] :"  +num[i]);
	  }
	 //num1:�迭 num2:�迭 num3: �迭 num4: �Ϲݺ���
	 int []num1,num3; //int[]�� �������� �Ǿ� num1,num3 �� �迭�̵�
	 //int�� �������� �Ǿ� num2�� �迭, num4�� �Ϲ� ��������
	 int num2[],num4;
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	if(size >=0)
		num1 = new int[size];
	scan.close();
	/*�迭 �ʱ�ȭ*/int num5[]={1,2,3,4,5,};
	   for(int i=0; i<num5.length; i++){
	    	  num[i] =i+1;
	      }
		  for(int i=0;i<num.length; i++){
			  System.out.println("num["+i+ "] :"  +num5[i]);
	int num6[];
		 //num6={1,2,3,4,5,}; �ʱ�ȭ�� �迭�� �����Ҷ��� ����
		  }

}
}
