package day1;

public class ScoreEx {

	public static void main(String[] args) {
	//�����ε� ������ �������� ����ϼ���.
    //0~59: F
	//60~69:D
	//70~79:C
	//80~89:B
	//90~100:A	
	/*
		int score = 88;
	
	if(score<=59){System.out.println("������ F �Դϴ�");}
	else if(score<=69){System.out.println("������ D �Դϴ�");}
	else if(score<=79){System.out.println("������ C �Դϴ�");}
	else if(score<=89){System.out.println("������ B �Դϴ�");}
	else if(score<=100){System.out.println("������ A �Դϴ�");}
	else {System.out.println("������ �߸� �Է��߽��ϴ�.");}
	
	*/
		int score = 88;
		if(score<=100&&score>=90){System.out.println("������ A �Դϴ�");}
		else if(score<=89&&score>=80){System.out.println("������ B �Դϴ�");}
		else if(score<=79&&score>=70){System.out.println("������ C �Դϴ�");}
		else if(score<=69&&score>=60){System.out.println("������ D �Դϴ�");}
		else if(score<=59&&score>=0){System.out.println("������ F �Դϴ�");}
		else {System.out.println("������ �߸� �Է��߽��ϴ�.");}
	
	
	}
}
