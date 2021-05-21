package virtusa.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generics {
	public static List getCountryName(String s1,String s2,String s3,String s4,String s5)
	{
		List<String> l=new ArrayList<String>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		return l;
	}
	public static Set GetNumber()
	{
		Set<Integer> s=new HashSet<Integer>();
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println( getCountryName("India","London","USA","UK","Canada"));
		System.out.println(GetNumber());

	}

}
