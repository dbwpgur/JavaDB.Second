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
		
		
		/*               ���� :4 �� 1
		                 ���� :3 �� 3
		                 ����: 2 �� 5
		 			 	 ���� :1 �� 7
		                 ���� :0 �� 9
		                 ���� :5-i �� 2*i-1
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
//		System.out.println(i+"��");
//		for(int j=1;j<9;j++){
//			System.out.println(i*j);
//		}
//	}
	/*2���� 100������ ��� �Ҽ��� ����ϼ���.*/
		
		
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


