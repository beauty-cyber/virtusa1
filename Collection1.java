package myprogram.org;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
	static List lnum=new ArrayList();
	public static void main(String[] args) {
		System.out.println(getCountryName("India","UK","US","China","Pakistan"));
		System.out.println(getNumber());
		System.out.println(getNumber1());

	}
	public static List getCountryName(String s1,String s2,String s3,String s4,String s5)
	{
		List l=new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		return l;
	}
	public static List getNumber()
	{
		for(int i=1;i<=10;i++)
		{
			lnum.add(i);
		}
		return lnum;
	}
	public static List getNumber1()
	{
		List l1=new ArrayList();
		l1.addAll(lnum);
		for(int i=11;i<=15;i++)
		{
			l1.add(i);
		}
		return l1;
	}
	
}
