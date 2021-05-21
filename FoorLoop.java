package virtusa.com;

import java.util.List;

public class FoorLoop {

	public static void main(String[] args) {
		ArrayListEx ex1=new ArrayListEx();
		List countryList=ex1.getCountryName("India", "USA", "UK", "Canada","Maldives");
		int count=countryList.size();
		for(int i=0;i<count;i++)
		{
			String country=(String) countryList.get(i);
			System.out.println(country);
		}
	}

}
