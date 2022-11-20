package finci;

import java.util.Scanner;

public class Arkhmamasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of patients escaped");
		int p=sc.nextInt();
		System.out.println("enter the no of steps taken by first patient at which batman started");
		int s=sc.nextInt();
		sc.close();
		int g=findnumberofsteps(p,s);
		System.out.println("the no steps taken by patient no "+p+" at the time batman started = "+g);

	}
	
	
	//number of steps batman makes in the process of tagging patients is (p*2)
	//where p is no of patients escaped and 2 is no of steps he takes for each patient
	public static int findnumberofsteps(int p,int s) {
		
		int y=p*s;
		return y;
	}
	

}
