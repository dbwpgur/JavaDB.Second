package day1;

public class ScoreEx {

	public static void main(String[] args) {
	//정수로된 성적을 학점으로 출력하세요.
    //0~59: F
	//60~69:D
	//70~79:C
	//80~89:B
	//90~100:A	
	/*
		int score = 88;
	
	if(score<=59){System.out.println("학점은 F 입니다");}
	else if(score<=69){System.out.println("학점은 D 입니다");}
	else if(score<=79){System.out.println("학점은 C 입니다");}
	else if(score<=89){System.out.println("학점은 B 입니다");}
	else if(score<=100){System.out.println("학점은 A 입니다");}
	else {System.out.println("성적을 잘못 입력했습니다.");}
	
	*/
		int score = 88;
		if(score<=100&&score>=90){System.out.println("학점은 A 입니다");}
		else if(score<=89&&score>=80){System.out.println("학점은 B 입니다");}
		else if(score<=79&&score>=70){System.out.println("학점은 C 입니다");}
		else if(score<=69&&score>=60){System.out.println("학점은 D 입니다");}
		else if(score<=59&&score>=0){System.out.println("학점은 F 입니다");}
		else {System.out.println("성적을 잘못 입력했습니다.");}
	
	
	}
}
