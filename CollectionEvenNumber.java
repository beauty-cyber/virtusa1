package virtusa.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionEvenNumber {
	static ArrayList<Integer> A1=new ArrayList<Integer>();
	public static ArrayList storeEvenNumbers(int N)
	{
		for(int i=2;i<=N;i++)
		{
			A1.add(i);
		}
		return A1;
	}
	public static ArrayList printEvenNumber()
	{
		ArrayList<Integer> A2=new ArrayList<Integer>();
		Iterator itr=A1.iterator();
		while(itr.hasNext())
		{
			Integer I=(Integer)itr.next();
			if(I%2==0)
				A2.add(I*2);
		}
		return A2;
	}
	public static int retrieveEvenNumber(int N)
	{
		for(int i=0;i<A1.size();i++)
		{
			if(A1.get(i)==N)
				return N;
		}
		return 0;
	}
}
