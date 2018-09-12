package week1;

public class Student{

    // TODO: khai báo các thuộc tính cho Student
	private String Name;
	private String Id;
	private String Group;
	private String Email;
    public String getName(){
		return this.Name;
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getId(){
		return this.Id;
	}
	public void setId(String id){
		this.Id = id;
	}
	public String getGroup(){return Group;}
	public void setGroup(String group)
	{
		this.Group = group;
	}
	public String getEmail(){return this.Email;}
	public void setEmail(String email)
	{
		this.Email = email;
	}
	
    Student() {
    	this.Name = "Student";
    	this.Id = "000";
    	this.Group = "INT22041";
    	this.Email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.Name = n;
        this.Id = sid;
		this.Group = "INT22041";
        this.Email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.Name  = s.Name;
        this.Id = s.Id;
        this.Group = s.Group;
        this.Email = s.Email;
    }

    String getInfo() {
        String s = this.Name + " " + this.Id + " " + this.Group +" " + this.Email;
       return s;
    }
}
