package virtusa.com;
public class ClientDemo {
public static void main(String[] args) throws CloneNotSupportedException {
	CarCache.insert();
		Car nano=CarCache.getcar("Nano");
		System.out.println("Green Nano and it's price is Rs."+nano.getPrice());
 Car ford=CarCache.getcar("Ford");
 System.out.println("Yellow Ford and it's price is Rs."+ford.getPrice());
}
}
