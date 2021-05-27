package virtusa.com;

import java.util.Hashtable;

public class CarCache {
static Hashtable b=new Hashtable();
public static Car getcar(String i) throws CloneNotSupportedException {
	Car c=(Car) b.get(i);
	return (Car) c.clone();
}
public static void insert() {
	Nano na=new Nano();
	na.setModelName("Nano");
	b.put(na.getModelName(), na);
	Ford fo=new Ford();
	fo.setModelName("Ford");
	b.put(fo.getModelName(),fo);
}
}
