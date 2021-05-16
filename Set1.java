package myprogram.org;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	static Set s=new HashSet();
	public static void main(String[] args) {
		System.out.println(getCountryName("India","UK","US","China","Pakistan"));
		System.out.println(getNumber());
		System.out.println(getNumber1());

	}
	public static Set getCountryName(String s1,String s2,String s3,String s4,String s5)
	{
		Set s=new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		return s;
	}
	public static Set getNumber()
	{
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		return s;
	}
	public static Set getNumber1()
	{
		Set s1=new HashSet();
		s1.addAll(s);
		for(int i=11;i<=15;i++)
		{
			s1.add(i);
		}
		return s1;
	}
}
