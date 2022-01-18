package java_dotstar.dotstar05;

public class dotstar05 {

	public static void main(String[] args) {
		int k=5;
		for(int i = 0; i < 2*k-1; i++) {
			
			if(i < k) {
				for(int j = 0; j < k-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j = 0; j <= i-k+1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}

}
