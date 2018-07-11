package day3;

public class ForEx1 {

	public static void main(String[] args) {
		
		
		
		
		
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=5;j++){
//				System.out.print("*");
//			}
//				System.out.println();
//		}

	
//		for(int i=0;i<5;i++){
//			for(int j=0;j<=i;j++){
//				System.out.print("*");
//			}
//				System.out.println();
//	}
		
		
//		for(int i=5;i>=1;i--){
//		for(int j=0;j<=5;j++){
		
//			if(j>=i){
//			System.out.print("*");
//		
//		}
//		else{System.out.print(" "); }
//		}
//		
//		System.out.println();
//		
//		}
//		
		
		
		/*               공백 :4 별 1
		                 공백 :3 별 3
		                 공백: 2 별 5
		 			 	 공백 :1 별 7
		                 공백 :0 별 9
		                 공백 :5-i 별 2*i-1
		 */
//	for(int i=1; i<=5; i++){
//		for(int j=1;j<=5-i;j++){
//			System.out.print(" ");
//		}
//	for(int j=1;j<=2*i-1;j++){
//		System.out.print("*");
//	}
//	System.out.println("");
//	}
//	
//	}
//
//}
		
	/*for(int i =1; i<=5; i++){
		for(int j=1;j<=5;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=11-2*i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	*/
//		for(int i =1; i<=5; i++){
//			for(int j=1;j<=2*5-i;j++){
//				if(j <=i-1)
//				System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//		
//			System.out.println();
//		}
//			
//	for(int i=2;i<=9;i++){
//		System.out.println(i+"단");
//		for(int j=1;j<9;j++){
//			System.out.println(i*j);
//		}
//	}
	/*2부터 100이하의 모든 소수를 출력하세요.*/
		
		
		for(int i=2;i<=100;i++){
			int cnt=0;
			for (int j=1;j<=i;j++){
				if(i%j==0)
				cnt++;
				}
		 if(cnt==2){
			 System.out.println(i);
		
		 }
		   
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}


