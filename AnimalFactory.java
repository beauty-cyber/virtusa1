package virtusa.com;

public class AnimalFactory {
	public Animal getAnimal(String animal)
	{
		if(animal.equals(null))
			return null;
		if(animal.equalsIgnoreCase("Duck"))
			return new Duck();
		else if(animal.equalsIgnoreCase("Tiger"))
			return new Tiger();
		return null;
	}
}
