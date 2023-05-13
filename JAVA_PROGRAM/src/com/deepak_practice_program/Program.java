package com.deepak_practice_program;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welecome To Java World";
		String[] splitstr=str.split(" ");
		String first="";
		for(String w:splitstr)
		{
			char[] ch=w.toCharArray();
			int each= ch.length;
			for(int i=0;i<each;i++)
			{
              				
				if(ch[i]==0)
				{
					first=first+ch[i];
				}
				System.err.println(first);
			}
		}
		
		

	}

}
