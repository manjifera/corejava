package demo;

public class Swapnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int nxt;
		int a[] = {-1,2,3,-1,-1,-1,3,3,5,7,7};
		int b[] = new int[10];
		//System.out.println(a.length-1);
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(a[j] >= 1) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
		}
	}
}
