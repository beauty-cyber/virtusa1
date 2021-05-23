package virtusa.com;

public class CollectionCaseStudyMain1 {

	public static void main(String[] args) {
		CollectionCaseStudy1 css1=new CollectionCaseStudy1();
		css1.storeCountryNames("India");
		css1.storeCountryNames("USA");
		css1.storeCountryNames("UK");
		css1.storeCountryNames("Canada");
		System.out.println(css1.storeCountryNames("Pakistan"));
		System.out.println(css1.retriveCountry("India"));
		

	}

}
