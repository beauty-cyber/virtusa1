package virtusa.com;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
interface Packing{
	public String Pack();
}