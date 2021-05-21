package virtusa.com;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	static Set<Integer> s=new HashSet<Integer>();
	public static void main(String[] args) {
		System.out.println(getCountryName("India","UK","US","China","Pakistan"));
		System.out.println(getNumber());
		System.out.println(getNumber1());

	}
	public static Set<String> getCountryName(String s1,String s2,String s3,String s4,String s5)
	{
		Set<String> s=new HashSet<String>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		return s;
	}
	public static Set<Integer> getNumber()
	{
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		return s;
	}
	public static Set<Integer> getNumber1()
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


