package day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		//�迭�� �̿��Ͽ� �л� 5���� ������ Ű����� ���� �Է¹ް�
		//���� ������ ����ϴ� �ڵ带 �ۼ��ϼ���
		double sum=0;
		double avg =0.0;
		int score[] =new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<score.length;i++){
			System.out.println("�л�"+i+"�������� �Է��ϼ��� :");
			score[i] = scan.nextInt();
		}
	    for(int i=0; i<score.length;i++){
	    	System.out.println("�л�"+(i+1)+"������ :"+score[i]);
	    }
	    for(int i=0; i<score.length;i++){
	    	sum=sum+score[i];
	        avg=avg=+(double)score[i]/score.length; 
	    }
	    System.out.println("�л����� ��հ�: "+sum/5.0);
	    System.out.println("�л����� ��հ�: "+(double)sum/score.length);
	}

}

