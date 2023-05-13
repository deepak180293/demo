package com.deepak_practice_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class RmoveDuplictae {
	
//Write a program that removes the
//duplicate characters from the given string.
	public static void m1()
	{
		String str1="WELCOME DEEPAK";
		String res="";
		int len=str1.length();
		for(int i=0;i<len;i++)
		{
			char c=str1.charAt(i);
			if(res.indexOf(c)==-1)
			{
				res=res+c;
			}
		}
		System.out.println(res);
	}
	
	public static void m2()
	{
		String str1="WELCOME DEEPAK";
		String res="";
		int len=str1.length();
		char c='E';
		for(int i=0;i<len;i++)
		{
			char ch=str1.charAt(i);
			if(ch!=c)
			{
				res=res+ch;
			}
			
	}
		System.out.println(res);
	}
	
	public static void m3()
	{
		String str="welcome deepak";
		int count =str.length();
		String str2="";
		
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<count;i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}else
			{
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character,Integer> en :map.entrySet())
		{
			if(en.getValue()>1)
			{
				System.out.println(en.getValue()+ "        "+en.getKey());
			}
		}
			
			
			
		}
		
		
		
		
		public static void m4()
		{
			
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Enter the number of strings: ");
			        int n = sc.nextInt();
			        String[] strings = new String[n];
			        System.out.println("Enter the strings:");
			        for (int i = 0; i < n; i++) {
			            strings[i] = sc.next();
			        }
			        Arrays.sort(strings, Comparator.comparingInt(String::length));
			        System.out.println("Strings sorted by length:");
			        for (String s : strings) {
			            System.out.println(s);
			        }
			    }
			
		
		
	
	
	public static void main(String[] args) {
		
		m4();
		m1();
		m2();
		m3();
	}

}
