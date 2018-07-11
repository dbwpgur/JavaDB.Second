package day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열을 이용하여 학생 5명의 성적을 키보드로 통해 입력받고
		//받은 점수를 출력하는 코드를 작성하세요
		double sum=0;
		double avg =0.0;
		int score[] =new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<score.length;i++){
			System.out.println("학생"+i+"의점수를 입력하세요 :");
			score[i] = scan.nextInt();
		}
	    for(int i=0; i<score.length;i++){
	    	System.out.println("학생"+(i+1)+"의점수 :"+score[i]);
	    }
	    for(int i=0; i<score.length;i++){
	    	sum=sum+score[i];
	        avg=avg=+(double)score[i]/score.length; 
	    }
	    System.out.println("학생들의 평균값: "+sum/5.0);
	    System.out.println("학생들의 평균값: "+(double)sum/score.length);
	}

}

