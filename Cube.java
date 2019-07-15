//java program for sum of cube
package lab4;

import java.util.*;

public class Cube {
	static int n=0;
	int sum=0;
	int rem=0;
	double res=0;
	
	public double cubes(int n) {
		while(n>0) {
			rem=n%10;
			res=res+Math.pow(rem, 3);
			n=n/10;
			}
		return res;
		}
public static void main(String[] args) {
		Cube cb=new Cube();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		String str=sc.next();
		try {
			int num=Integer.parseInt(str);
			System.out.println("Sum of cube of"+num+" is" +(int)cb.cubes(num));
			}
		//invalid input
		catch(NumberFormatException ex) {
			System.out.println("Invalid Input");
		}
}
}
