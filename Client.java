package virtusa.com;

public class Client {

	public static void main(String[] args) {
		IMovieFactory im=new ComedyMovieFactory();
		IMovieFactory im1=new ActionMovieFactory();
		System.out.println("Action movies are");
		im1.getHollywoodMovie("Kranti");
		im1.getBollywoodMovie("Bang Bang");
		System.out.println("Comedy Movies are");
		im.getHollywoodMovie("BasantaBilap");
		im.getBollywoodMovie("Munna bhai MBBS");

	}

}
