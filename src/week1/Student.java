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
	
<<<<<<< HEAD
    Student() {
    	this.Name = "Student";
    	this.Id = "000";
    	this.Group = "INT22041";
    	this.Email = "uet@vnu.edu.vn";
=======
    public Student() {
    	this.name = "Student";
    	this.id = "000";
    	this.group = "INT22041";
    	this.email = "uet@vnu.edu.vn";
>>>>>>> 3faae443a8441fb8b019137c6d7618b216ea4485
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
<<<<<<< HEAD
    Student(String n, String sid, String em) {
        this.Name = n;
        this.Id = sid;
		this.Group = "INT22041";
        this.Email = em;
=======
    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
>>>>>>> 3faae443a8441fb8b019137c6d7618b216ea4485
    }

    /**
     * Constructor 3
     * @param s
     */
<<<<<<< HEAD
    Student(Student s) {
        this.Name  = s.Name;
        this.Id = s.Id;
        this.Group = s.Group;
        this.Email = s.Email;
    }

    String getInfo() {
        String s = this.Name + " " + this.Id + " " + this.Group +" " + this.Email;
=======
    public Student(Student s) {
        this.name  = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        String s = name + " " + id + " " + group +" " +email;
>>>>>>> 3faae443a8441fb8b019137c6d7618b216ea4485
       return s;
    }
}
