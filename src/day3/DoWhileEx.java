package day3;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
//   do{���๮;
//      ��������;
//      }while(���ǽ�);
//���ǽ��� ���̵� �����̵� ������� ������ �ѹ��� ������
		
		char mode='q';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("�޴�");
			System.out.println("1.�л������߰�");
			System.out.println("2.�л��������");
			System.out.println("3.���α׷� ����");
			System.out.println("�޴��� �����ϼ���");
		    mode = scan.next().charAt(0);
		}while(mode !='q');
	}

}
