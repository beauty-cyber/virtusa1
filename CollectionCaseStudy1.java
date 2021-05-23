package virtusa.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionCaseStudy1 {

	int country;
	Set<String> s=new HashSet<String>();
	public Set<String> storeCountryNames(String CountryName)
	{
		s.add(CountryName);
		return s;
	}
	public String retriveCountry(String CountryName)
	{
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s==CountryName)
				return CountryName;
		}
		return null;
				
	}
		
}
