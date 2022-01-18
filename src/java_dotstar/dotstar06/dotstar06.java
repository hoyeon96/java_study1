package java_dotstar.dotstar06;

public class dotstar06 {
	public static void main(String[] args) {
		int k = 5;
		for(int i = 0; i < 2*k-1; i++) {
			if(i < k) {
				for(int j = 0; j < k; j++) {
					if(j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			} else {
				for(int j = 0; j < k; j++) {
					if(i+j >= 2*(k-1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}

	}

}
