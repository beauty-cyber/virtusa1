package virtusa.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionCaseStudy {
	int countryMap;
	Map<String,String> M1=new HashMap<String,String>();
	public Map<String,String> storeCountryCapital(String CountryName,String capital)
	{
		M1.put(CountryName, capital);
		return M1;
	}
	public String retrieveCapital(String CountryName)
	{
		Set<String> keys=M1.keySet();
		for(String i:keys)
		{
			if(i==CountryName)
				return M1.get(i);
		}
		return null;
	}
	public String retrieveCountry(String CapitalName)
	{
		Set<String> keys=M1.keySet();
		for(String i:keys)
		{
			if(M1.get(i)==CapitalName)
				return i;
		}
		return null;
	}
	public Map<String,String> storeCapitalCountry()
	{
		Map<String,String> M2=new HashMap<String,String>();
		Set<String> keys=M1.keySet();
		for(String s:keys)
		{
			M2.put(M1.get(s), s);
		}
		return M2;
	}
	public ArrayList<String> countryName()
	{
		ArrayList<String> al=new ArrayList<String>();
		Set<String> keys=M1.keySet();
		for(String s:keys)
		{
			al.add(s);
		}
		return al;
	}
	}
	

