import java.io.*;
import java.util.*;
class secnd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the numbers of array");
		for(int i=0;i<n;i++){
			int j=sc.nextInt();
			a[i]=j;
		}
		Arrays.sort(a);
		System.out.println("2nd highest numbers of array is "+a[n-2]);
		System.out.println("2nd lowest numbers of array is "+a[1]);
	}
}