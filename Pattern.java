package demo;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		
		//new pattern
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// new pattertn
		System.out.println();
		System.out.println("New Pattern with spaces.");
		System.out.println();
		
		for(i=1;i<=5;i++) {
			for(k=1;k<=5;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// new pattertn
				System.out.println();
				System.out.println("triangle Pattern with space.");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=5-i+1;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
		// new pattertn
				System.out.println();
				System.out.println("inverted triangle Pattern with space.");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=i;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=5-i+1;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
		// new pattertn
				System.out.println();
				System.out.println("spaces decrease starts remaims same");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=5-i+1;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=5;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
		// new pattertn
				System.out.println();
				System.out.println("isoside triangle");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=5-i+1;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=2*i-1;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
		// new pattertnSystem.out.println();
				System.out.println("hollow square");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=5;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=5;j++) {
						if(i==1 || i==5 || j==1 || j==5) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println("");
				}
				
				// hollow tringele pattertn
				System.out.println();
				System.out.println("hollow traingle");
				System.out.println();
				
				for(i=1;i<=5;i++) {
					for(k=1;k<=5-i+1;k++) {
						System.out.print(" ");
					}
					for(j=1;j<=2*i-1;j++) {
						if(i==1 || i==5 || j==1 || j==2*i-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
				
				/// 1
				///	2 3
				// hollow tringele pattertn
				System.out.println();
				System.out.println("123");
				System.out.println();
				int n =5;
				int count=1;
				for(i=1;i<=n;i++) {
					for(j=1;j<=i-1;j++) {
						System.out.print(count++ + " ");
						}
					System.out.println(" ");
					}
					
					
	}

}
