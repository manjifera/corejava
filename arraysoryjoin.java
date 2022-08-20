package demo;

public class arraysoryjoin {
	public static void main(String[] args) {
		int ar1[] = {1,4,7,9,10,14};
		int ar2[] = {2,3,5,6};
		int res[] = new int[ar1.length + ar2.length];
		int r=0;
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i] < ar2[j]) {
				res[k++] = ar1[i++];
			}
			else {
			if(ar1[i] > ar2[j]) {
				res[k++] = ar2[j++];
			}
		 }
		
		}
		while(i<ar1.length) {
			res[k++] = ar1[i++];
		}
		while(i<ar2.length) {
			res[k++] = ar2[j++];
		}
		for(i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}