package virtusa.com;

public class ActionMovieFactory implements IMovieFactory{
	public Hollywood getHollywoodMovie(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("Kranti"))
			System.out.println(str+" is a Tollywood action Movie");
		return null;
	}
	public Bollywood getBollywoodMovie(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("Bang Bang"))
			System.out.println(str+" is a Bollywood action Movie");
		return null;
	}

}
