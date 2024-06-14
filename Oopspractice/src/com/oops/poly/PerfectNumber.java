package com.oops.poly;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		long num;
		
		int sum=0;
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		num=sc.nextLong();
		
		//long i = 0;
		while(i<=num/2) {
			if (num % i==0)
				sum +=i;
		i++;
		}
		
		if (sum==num) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
		
	}

}
