
public class Fruit implements Comparable<Fruit>{
	int no;
	String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		
		this.no=no;
		this.name=name;
		this.price=price;
	}
	
	private int getNo() {
		return no;
	}
	private void setNo(int no) {
		this.no = no;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getPrice() {
		return price;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Fruit o){
		return name.compareTo(o.name);
		
	}
}
