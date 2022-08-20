package demo;

public class Hsqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int count = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(count<=9) {
					System.out.print(0);
				}
				System.out.print(count++ + " "); 		
			}
		System.out.println();
		}
		System.out.println();
		
		n = 5;
		//count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j<=9) {
					System.out.print(0);
				}
				System.out.print(i*j + " "); 		
			}
		System.out.println();
		}
		
System.out.println();
		
		n = 10;
		//count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=9) {
					System.out.print(0);
				}
				System.out.print(i+j + " "); 		
			}
		System.out.println();
		}
	}

}
