package virtusa.com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,M;
		System.out.println("Enter two number:");
		N=sc.nextInt();
		M=sc.nextInt();
		CollectionEvenNumber cv=new CollectionEvenNumber();
		cv.storeEvenNumbers(N);
		System.out.println(cv.printEvenNumber());
		System.out.println(cv.retrieveEvenNumber(M));

	}

}
