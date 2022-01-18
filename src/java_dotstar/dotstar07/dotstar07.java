package java_dotstar.dotstar07;

public class dotstar07 {
	public static void main(String[] args) {	
		int num = 5;
		for(int i = 0; i < num; i++) {
			if(i < num/2+1) {
				for(int k = 0; k <= i-1; k++) {
					System.out.print(" ");
				}
				for(int j = i; j < num-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				
				System.out.println();
			}
			
			
		}
		
	}
		
		
		
//		for(int i=0;i<k;i++) {
//			for(int j=0;j<k;j++) {
//				if(i<(k+1)/2) {
//					if(i<=j && i+j<k) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				else {
//					if(i>=j && i+j>=k-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	}
