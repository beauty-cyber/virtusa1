package virtusa.com;

import java.util.Set;

public class ForEachExMain {

	public static void main(String[] args) {
		SetEx sx=new SetEx();
		Set<String> countrySet=sx.getCountryName("India","Pakistan","China","Nepal","USA");
		int count=countrySet.size();
		for(String s:countrySet)
		{
			System.out.println(s);
		}
		Set<Integer> getNumber=sx.getNumber();
		int sum=0;
		for(Integer i:getNumber)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
