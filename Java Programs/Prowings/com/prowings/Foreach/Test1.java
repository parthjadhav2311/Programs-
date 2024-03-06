package com.prowings.Foreach;

public class Test1 {
	
		public static void main(String[] args) {
			String[] a= {"Sai","Parth","Shraddha"};
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			for(String aa:a)
			{
				System.out.println(aa);
			}
		}

	}



