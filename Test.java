package demo;

class Test {
	public static void main(String[] args) {
		
		int n = 5;
		for(int i=0;i<=n;i++) {
			int count = 1;
			for(int j=1;j<=(2*i)-1;j++) {
				if(j<i) {
					System.out.print(count++ + " ");
				}
				else {
					System.out.print(count-- + " ");
				}
				
			}
			System.out.println();
		}
	}
}
