
import java.util.HashSet;
import java.util.ArrayList;
//2
public class StudentManagement {
//11
    private  Student students[] = new Student[100] ;
	private int Number = 3;
//9
    public boolean sameGroup(Student s1, Student s2) {
		String str1 = s1.getGroup();
		String str2 = s2.getGroup();
        if(str1.equals(str2)) return true;
        return false; 
    } 
//12
    public void studentsByGroup() {
	    HashSet<String> StudentGroupList = new HashSet<String>();
	    for(int i = 0; i < Number; i++) {
	    	StudentGroupList.add(students[i].getGroup());
	    }
	    for(String Group : StudentGroupList) {
	    	System.out.println("Class: "+ Group);
	    	for(int i = 0; i < Number; i++) {
	    		if(students[i].getGroup().equals(Group)) {
	    			System.out.println(students[i].getInfo());

	    for(String Group : List) {
	    	System.out.println("Class"+ Group);
	    	for(Student st:students) {
	    		if(st.getGroup()==(Group)) {
	    			System.out.println(st.getInfo());
	    		}
	    	}
	    }
    }

//13
    public static void removeStudent(String id) {
		int Index = -999;
		for(int i = 0; i < Number;i ++)
		{
			if(students[i].getId().equals(id))
			{
				Index = i;
				break;
		if(Index != -999)
		{
			students[Index] = null;
			for(int i = 0; i < Number - 1; i++)
			{
				students[i] = students[i+1];
			}
		}
		else System.out.println("Can't Not Delete That Student By Id");
	}
	public static void main(String args[]){
//6

		Student st1 = new Student();
		st1.setName("Vũ Việt Hoàng");
		st1.setId("17020778");
		st1.setGroup("INT22041");
		st1.setEmail("hoang9cnd@gmail.com");
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
		StudentManagement StudentList = new StudentManagement();
		StudentList.students[0]=st1;
		StudentList.students[1]=st2;
		StudentList.students[2]=st3;
		StudentList.students[3]=st4;
		StudentList.removeStudent("1702151");
		StudentList.studentsByGroup();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st1);
		removeStudent("17021567");
		studentsByGroup();
//10
		StudentManagement student = new StudentManagement();
		if(student.sameGroup(st1, st2)) System.out.println("Same Class!");
		else System.out.println("Not Same Class2");
		
	}

	

}
