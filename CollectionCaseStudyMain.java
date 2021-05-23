package virtusa.com;

public class CollectionCaseStudyMain {

	public static void main(String[] args) {
		CollectionCaseStudy ccs=new CollectionCaseStudy();
		System.out.println(ccs.storeCountryCapital("India", "Delhi"));
		System.out.println(ccs.storeCountryCapital("Japan", "Tokyo"));
		System.out.println(ccs.retrieveCapital("India"));
		System.out.println(ccs.retrieveCountry("Tokyo"));
		System.out.println(ccs.storeCapitalCountry());
		System.out.println(ccs.countryName());

	}

}
