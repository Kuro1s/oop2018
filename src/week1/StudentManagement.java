import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
//2
public class StudentManagement {
//11
    private static ArrayList<Student> students = new ArrayList<Student>(100);
//9
    public static boolean sameGroup(Student s1, Student s2) {
		String str1 = s1.getGroup();
		String str2 = s2.getGroup();
        if(str1.equals(str2)) return true;
        return false; 
    } 
//12
    public static void studentsByGroup() {
	    HashSet<String> List = new HashSet<String>();
	    for(Student st: students) {
	    	List.add(st.getGroup());
	    }
	    for(String Group : List) {
	    	System.out.println("Class"+ Group);
	    	for(Student st:students) {
	    		if(st.getGroup().equals(Group)) {
	    			System.out.println(st.getInfo());
	    		}
	    	}
	    }
    }
//13
    public static void removeStudent(String id) {
		int length = students.size();
		Student student = null;
		for(int i = 0; i < length; i++){
		if(students.get(i).getId() == id){
			student = students.get(i); 
			break;
			}
		}
		if(student != null) students.remove(student);
		else System.out.println("Can't not Detele!");
		
		
    }
	public static void main(String args[]){
//6
		Student st1 = new Student();
		st1.setName("Vũ Việt Hoàng");
		st1.setId("17020778");
		st1.setGroup("INT22041");
		st1.setEmail("hoang9cnd@gmail.com");
		System.out.println(st1.getName());
		System.out.println(st1.getInfo());
//9
		Student st2 = new Student();
		st2.setName("Vũ Hoàng Việt");
		st2.setId("17020788");
		st2.setGroup("INT22042");
		st2.setEmail("hoang92cnd@gmail.com");
//8
		Student st3 = new Student("Hoàng Vũ Việt","17026575","17020778@vnu.edu.vn");
		Student st4 = new Student(st2);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		removeStudent("17021567");
		studentsByGroup();
//10
		StudentManagement student = new StudentManagement();
		if(student.sameGroup(st1, st2)) System.out.println("Cùng lớp");
		else System.out.println("Không Cùng lớp");
		
	}
	
}
