import java.util.Scanner;
public class Student{

    // TODO: khai báo các thuộc tính cho Student
	private String name;
	private String id;
	private String group;
	private String email;
    public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getGroup(){return group;}
	public void setGroup(String group)
	{
		this.group = group;
	}
	public String getEmail(){return email;}
	public void setEmail(String email)
	{
		if(email == null || email.isEmpty()){
			this.email = "Group không hợp lệ!";
		}
		else this.email = email;
	}
	
    public Student() {
    	this.name = "Student";
    	this.id = "000";
    	this.group = "INT22041";
    	this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        this.name  = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        String s = name + " " + id + " " + group +" " +email;
       return s;
    }
}
