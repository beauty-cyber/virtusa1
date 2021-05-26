package virtusa.com;

public class Demo {

	public static void main(String[] args) {
		AnimalFactory animalFactory=new AnimalFactory();
		Animal animal=animalFactory.getAnimal("Duck");
		animal.eat();
		Animal animal1=animalFactory.getAnimal("Tiger");
		animal1.eat();

	}

}
