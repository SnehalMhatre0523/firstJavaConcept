package A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KeepZeroAtEndOfArray {
	 public static void reorderArry(int[] A) {
		 int k = 0;
		  for(int i: A) {
			  if(i!=0) { A[k++]=i;}
			 
		  }
		  for(int j= k;j<A.length;j++) {
			  A[j]=0;
		  }
	 }
	 
	public static void main(String[] args) {
		int[] A= {1,2,4,0,23,54,0,22,0,21};
		//reorderArry(A);
		 int k = 0;
		  for(int i: A) {
			  if(i!=0) {
			  A[k++]=i;}
		  }
		  for(int j= k;j<A.length;j++) {
			  A[j]=0;
		  }
		System.out.println(Arrays.toString(A));
	}
}
