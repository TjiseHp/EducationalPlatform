package com.hp.util;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int max = 0;
		int count=0;
		int [] a = new int [num];
		int [] b = new int [num];
		for(int i=0;i<num;i++) {
			a[i]=in.nextInt();
			b[i]=0;
		}
		
		for(int i=num-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if (a[j]>=a[i]) {
					b[j]++;
					break;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			if (b[i]!=0 && b[i]>=count) {
				count=b[i];
				max=a[i];
			}
		}
		System.out.println(max);
		in.close();
	}
}
