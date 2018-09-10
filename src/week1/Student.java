
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
		if(name == null || name.isEmpty()){
			this.name = "Tên không hợp lệ!";
		}
		else this.name = name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		if(id == null || id.isEmpty()){
			this.id = "Id không hợp lệ!";
		}
		else this.id = id;
	}
	public String getGroup(){return group;}
	public void setGroup(String group)
	{
		if(group == null || group.isEmpty()){
			this.group = "Group không hợp lệ!";
		}
		else this.group = group;
	}
	public String getEmail(){return email;}
	public void setEmail(String email)
	{
		if(email == null || email.isEmpty()){
			this.email = "Group không hợp lệ!";
		}
		else this.email = email;
	}
	
    Student() {
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
    Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name  = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        String s = name + " " + id + " " + group +" " +email;
       return s;
    }
}
