import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<Student>();
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "조영리", 25);
		s.add(s1);
		Student s2 = new Student(2, "이성규", 22);
		s.add(s2);
		Student s3 = new Student(3, "공호중", 21);
		s.add(s3);
		s.add(new Student(4,"정소혜", 21));
		s.add(new Student(5, "김예준", 21));
		s.add(new Student(6, "오영광", 21));
		s.add(new Student(7, "임병휘", 22));
		s.add(new Student(8, "김지수", 23));
		s.add(new Student(9, "최산성", 24));
		s.add(new Student(10, "오하영", 21));
		
		
		Collections.sort(s);
		System.out.println("StudentList  (Ordered by name)");
		for(int i=0;i<s.size();i++){
			System.out.println(s.get(i).toString());
		}
	
		System.out.println("StudentList  (Reverse Ordered by name)");
		
		Collections.sort(s, Collections.reverseOrder());
		
		for(Student j:s) {
			System.out.println(j.toString());
		}

	}
}

