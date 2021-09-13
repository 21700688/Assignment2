import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruit = new ArrayList<Fruit>();
		
		Fruit f1 = new Fruit(1,"수박",10000);
		fruit.add(f1);
		fruit.add(new Fruit(2,"사과",1000));
		fruit.add(new Fruit(3,"복숭아",6000));
		fruit.add(new Fruit(4,"참외",4000));
		fruit.add(new Fruit(5,"망고",6000));
		fruit.add(new Fruit(6,"바나나",2000));
		fruit.add(new Fruit(7,"메론",9000));
		fruit.add(new Fruit(8,"귤",400));
		fruit.add(new Fruit(9,"오렌지",5000));
		fruit.add(new Fruit(10,"키위",1000));
		
		
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
