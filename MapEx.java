package virtusa.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args)
	{
		Map<Integer,String> myMap=new HashMap<Integer,String>();
		studentDetails(myMap);
		Set<Integer> keys=myMap.keySet();
		for(Integer i:keys)
		{
			System.out.println("Roll number is:"+i+" Name is:"+myMap.get(i));
		}

	}
	public static void studentDetails(Map<Integer,String> Map)
	{
		
		Map.put(1, "Beauty");
		Map.put(2, "Dimple");
		Map.put(8, "Harish");
		Map.put(4, "Shamal");
		Map.put(5, "Bharati");
		
	}

}
