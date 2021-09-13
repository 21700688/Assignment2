import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruit = new ArrayList<Fruit>();
		
		Fruit f1 = new Fruit(1,"����",10000);
		fruit.add(f1);
		fruit.add(new Fruit(2,"���",1000));
		fruit.add(new Fruit(3,"������",6000));
		fruit.add(new Fruit(4,"����",4000));
		fruit.add(new Fruit(5,"����",6000));
		fruit.add(new Fruit(6,"�ٳ���",2000));
		fruit.add(new Fruit(7,"�޷�",9000));
		fruit.add(new Fruit(8,"��",400));
		fruit.add(new Fruit(9,"������",5000));
		fruit.add(new Fruit(10,"Ű��",1000));
		
		
		System.out.println("Fruit List(ordered by name)");
		Collections.sort(fruit, new FruitComparator());
		
		for(Fruit k:fruit) {
			System.out.println(k.toString());
		}
		
		Collections.sort(fruit, new FruitComparatorDesc());
		System.out.println("Fruit List(reverse ordered by name)");
		for(Fruit k:fruit) {
			System.out.println(k.toString());
		}
		
	

	}

}
