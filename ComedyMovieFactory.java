package virtusa.com;

public class ComedyMovieFactory implements IMovieFactory{
	public Hollywood getHollywoodMovie(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("BasantaBilap"))
			System.out.println(str+" is a Tollywood Comedy Movie");
		return null;
	}
	public Bollywood getBollywoodMovie(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("Munna bhai MBBS"))
			System.out.println(str+" is a Bollywood Comedy Movie");
		return null;
	}
}
