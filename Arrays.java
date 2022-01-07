package apnacollage.com;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		/*
		 * Scanner sc=new Scanner(System.in); int name[]=new int[3]; name[0]=1;
		 * name[1]=2; name[2]=3; for(int i=0;i<3;i++) { System.out.println(name[i]); }
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		int size=sc.nextInt();
		
		int[] marks= new int[size];
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		
	for(int i=0;i<marks.length;i++) {
		if(marks[i]==x) {
			System.out.println(i);	
		}
		
	}	
		
	}}
