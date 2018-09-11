import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
	int n;
	public Student students[] ;
    public boolean sameGroup(Student s1, Student s2) {
		String str1 = s1.getGroup();
		String str2 = s2.getGroup();
        if(str1.equals(str2)) return true;
        return false; 
    } 
    void studentsByGroup() {
	    HashSet<String> List = new HashSet<String>();
	    for(Student st: students) {
	    	List.add(st.getGroup());
	    }
	    for(String Group : List) {
	    	System.out.println("Lớp"+ Group);
	    	for(Student st:students) {
	    		if(st.getGroup()==Group) {
	    			System.out.println(st.getInfo());
	    		}
	    	}
	    }
    }
    void removeStudent(String id) {
	/*	int n = students.length;
		for(int i = 0; i < n; i ++)
		{
			if(students[i].getId() == id)
			{
				students[i] = students[i+1];
			}
			--n;
		} */
	    HashSet<Student> List = new HashSet<Student>();
	    for(Student st: students) {
	    	List.add(st);
	    } 
		for(Student st: List)
		{
			if(st.getId() == id) List.remove(st);
		}
    }
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Student st1 = new Student();
		//6
		st1.setName("Vũ Việt Hoàng");
		st1.setId("17020778");
		st1.setGroup("INT22041");
		st1.setEmail("hoang91cnd@gmail.com");
		System.out.println(st1.getName());
		System.out.println(st1.getInfo());
		Student st2 = new Student();
		//10
		st2.setName("Vũ Hoàng Việt");
		st2.setId("17020788");
		st2.setGroup("INT22041");
		st2.setEmail("hoang92cnd@gmail.com");
		Student st3 = new Student();
		st3.setName("Hoàng Việt Vũ");
		st3.setId("17020388");
		st3.setGroup("INT22042");
		st3.setEmail("hoang9cnd@gmail.com");
		StudentManagement student = new StudentManagement();
		if(student.sameGroup(st1, st3)) System.out.println("Cùng lớp");
		else System.out.println("Không Cùng lớp");
		//13
		System.out.print("Nhập số sinh viên: ");
		int n = Integer.parseInt(input.nextLine());
		students = new Student[n];
		for(int i = 0; i < n; i ++){
			System.out.println("Nhập sinh viên thứ "+ (i+1));
			students[i] = new Student();
			students[i].nhap();
		}
		System.out.println("nhập id cần xoa");
		String id = input.nextLine();
		StudentManagement s1 = new StudentManagement();
        s1.removeStudent(id);		
	}
	
}
