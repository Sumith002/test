package finci;

import java.util.Arrays;
public class Ironmanlega {
	public static void main(String [] args) {
		int[] pla=new int[5];
		for(int i=0;i<pla.length-1;i++) {
			pla[i]=0;
		}
		int[][] a= {{2,3,6},{0,4,17},{3,4,9}};
		String t=findTheRanges(pla,a);
		System.out.println(t);
	}
	public static String findTheRanges(int[] pn,int[][] rv) {
		int k=0,l=0;
		int q=rv.length-1;
		int u=pn.length-1;
		for(int i=0,j=0;i<=q;i++) {
			
				for(int n=rv[i][j];n<rv[i][j+1];n++) {
					int d=rv[i][j+2];
					pn[n]=pn[n]+d;
					
				}
			
		}
		int max=pn[0];
		
		for(int i=1;i<pn.length-1;i++) {
			if(pn[i]>max) {
				max=pn[i];
				k=i;
				l=i+1;
			}
			
		}
      	if(k>u) {
			
			k=u;
		}
      	
		int[]arr=new int[3];
			arr[0]=k;
			arr[1]=l;
			arr[2]=max;
		
		
		return Arrays.toString(arr);
		
	}
	
	

}
