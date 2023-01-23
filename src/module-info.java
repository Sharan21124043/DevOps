/**
 * 
 */
/**
 * @author hp
 *
 */
module bubblesort {
	import java.util.*;
	import java.util.Scanner;
	class bubblesorttt
	{
	public static void main(String[]args)
	{	
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size: ");
		n=s.nextInt();

		int [] sharan = new int[n];
		System.out.println("enter elements : ");
		for(int c=0;c<n;c++)
	{
		sharan[c]=s.nextInt();
	}
		for(int c=0;c<n-1;c++)
	{
		for(int d=0;d<n-c-1;d++)
	{
		if( sharan[d] > sharan[d+1])
	{
		int swap = sharan[d+1];
		sharan[d+1]= sharan[d];
		sharan[d] = swap;
	}
	}
	}
	System.out.println("after sorting :");
		for(int c=0;c<n;c++)
	System.out.println(sharan[c]);
	}
	}
}