package finci;

import java.util.Arrays;

public class Grootspie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[]a = {1,3,4,6,7,6,8,};
	   int b=a.length-1;
	   int num=4;
	   int[]d=findSum(a,b,num);
	   if(d==null) {
		   System.out.println("sorry groot there are no pies to eat");
		   return;
	   }
	   else {
		   System.out.println("there are pies for you groot eat and enjoy");
	   System.out.println(Arrays.toString(d));

	}}
	public static int[] findSum(int[]a,int b,int num) {
		int[]d=new int[2];
		if(b==1) {
		int currsum=a[0];
		if(currsum==num) {
			d[0]=a[0];
			return d;}
		}
		else {
		for(int i=0;i<=b-1;i++) {
			for(int j=i+1;j<=b-1;j++) {
				int currsum=a[i]+a[j];
				if(currsum==num) {
					d[0]=a[i];
					d[1]=a[j];
					return d;
				}
			}
			
		}
		
	}
		System.out.println("no fuits found to eat");
return null;

}
}