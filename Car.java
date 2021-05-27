package virtusa.com;

public abstract class Car implements Cloneable{
	String modelName;
	int price=45663;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public Object clone() throws CloneNotSupportedException{
		Object obj=null;
		obj=super.clone();
		return obj;
	}

}
