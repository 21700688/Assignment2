
public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
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
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

}
