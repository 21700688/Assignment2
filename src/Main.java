import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<Student>();
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "������", 25);
		s.add(s1);
		Student s2 = new Student(2, "�̼���", 22);
		s.add(s2);
		Student s3 = new Student(3, "��ȣ��", 21);
		s.add(s3);
		s.add(new Student(4,"������", 21));
		s.add(new Student(5, "�迹��", 21));
		s.add(new Student(6, "������", 21));
		s.add(new Student(7, "�Ӻ���", 22));
		s.add(new Student(8, "������", 23));
		s.add(new Student(9, "�ֻ꼺", 24));
		s.add(new Student(10, "���Ͽ�", 21));
		
		
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

