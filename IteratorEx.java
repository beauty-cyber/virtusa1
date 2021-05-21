package virtusa.com;

import java.util.Iterator;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		SetEx sx1=new SetEx();
		Set<String> countrySet=sx1.getCountryName("India","USA","UK","Japan","Indonesia");
		Iterator<String> i=countrySet.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}

	}

}
